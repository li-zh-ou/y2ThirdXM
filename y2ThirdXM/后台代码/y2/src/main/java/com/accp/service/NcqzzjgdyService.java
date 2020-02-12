package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.domain.Bumen;
import com.accp.domain.Gangwei;
import com.accp.domain.Yuangong;
import com.accp.domain.YuangongExample;
import com.accp.domain.Yuangongshu;
import com.accp.mapper.BumenMapper;
import com.accp.mapper.GangweiMapper;
import com.accp.mapper.YuangongMapper;
import com.accp.mapper.YuangongshuMapper;

@Service
@Transactional
public class NcqzzjgdyService {

	@Autowired
	YuangongMapper yuangongMapper;

	@Autowired
	BumenMapper bumenMapper;

	@Autowired
	GangweiMapper gangweiMapper;

	@Autowired
	YuangongshuMapper yuangongshuMapper;

	// 组织机构树状图查询
	public List<Bumen> querybm() {
		return bumenMapper.selectByExample(null);
	}

	// 组织机构员工详情查询
	public List<Yuangong> ygcx() {
		return yuangongMapper.ygcx();
	}

	// 组织机构置空密码
	public int zkmm(String yuanno) {
		return yuangongMapper.zkmm(yuanno);
	}

	// 组织机构生成员工编号
	public Yuangong newCno() {
		YuangongExample example = new YuangongExample();
		example.setOrderByClause("yuanno desc");
		List<Yuangong> list = yuangongMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	// 组织机构 查询员工属性
	public List<Yuangongshu> cxygsx() {
		return yuangongshuMapper.selectByExample(null);
	}

	// 组织机构 新增员工
	public int zzjgxzyg(Yuangong yuangong) {
		return yuangongMapper.insert(yuangong);
	}

	// 组织机构修改员工查询
	@GetMapping("/byupygff")
	public Yuangong byupygff(String yuanno) {
		return yuangongMapper.byupygff(yuanno);
	}

	// 组织机构修改员工
	public int upygxq(Yuangong yuangong) {
		return yuangongMapper.insert(yuangong);
	}

	// 岗位定义查询
	public List<Gangwei> querygw() {
		return gangweiMapper.selectByExample(null);
	}

	// 岗位定义新增岗位
	public int insertgw(Gangwei gangwei) {
		return gangweiMapper.insert(gangwei);
	}

	// 岗位定义删除岗位
	public int delByIdgw(Integer gangweid) {
		return gangweiMapper.deleteByPrimaryKey(gangweid);
	}

	// 岗位定义修改岗位
	public int upgw(Integer gangweid, String gangweiname, Integer ids) {
		return gangweiMapper.update(gangweid, gangweiname, ids);
	}

}
