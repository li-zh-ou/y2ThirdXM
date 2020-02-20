package com.accp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.domain.Bumen;
import com.accp.domain.Gangwei;
import com.accp.domain.Jigong;
import com.accp.domain.JigongExample;
import com.accp.domain.Jigongban;
import com.accp.domain.Jigongstar;
import com.accp.domain.Lizhi;
import com.accp.domain.Waiqingcar;
import com.accp.domain.Yuangong;
import com.accp.domain.YuangongExample;
import com.accp.domain.Yuangongshu;
import com.accp.domain.Zhiwu;
import com.accp.mapper.BumenMapper;
import com.accp.mapper.GangweiMapper;
import com.accp.mapper.JigongMapper;
import com.accp.mapper.JigongbanMapper;
import com.accp.mapper.JigongstarMapper;
import com.accp.mapper.LizhiMapper;
import com.accp.mapper.WaiqingcarMapper;
import com.accp.mapper.YuangongMapper;
import com.accp.mapper.YuangongshuMapper;
import com.accp.mapper.ZhiwuMapper;

@Service
@Transactional
public class NcqzzjgdyService {

	@Autowired
	JigongMapper jigongMapper;

	@Autowired
	JigongbanMapper jigongbanMapper;

	@Autowired
	WaiqingcarMapper waiqingcarMapper;

	@Autowired
	JigongstarMapper jigongstarMapper;

	@Autowired
	LizhiMapper lizhiMapper;

	@Autowired
	ZhiwuMapper zhiwuMapper;

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
	public Yuangong byupygff(String yuanno) {
		return yuangongMapper.byupygff(yuanno);
	}

	// 组织机构修改员工
	public int upygxq(Yuangong yuangong) {
		return yuangongMapper.updateByPrimaryKey(yuangong);
	}

	// 组织机构查询角色
	public List<Zhiwu> zzjgcxjs() {
		return zhiwuMapper.selectByExample(null);
	}

	// 组织机构赋予员工角色
	public int fujs(String zhiwuid, String yuanno) {
		return yuangongMapper.fujs(zhiwuid, yuanno);
	}

	// 组织机构赋删除员工
	public int xglzzt(String yuanno) {
		return yuangongMapper.xglzzt(yuanno);
	}

	// 组织机构点击树状图获取部门在根据部门id查询员工详情
	public List<Yuangong> gjbmcxyg(Integer bumenid) {
		return yuangongMapper.gjbmcxyg(bumenid);
	}

	// 组织机构新增部门
	public int xzbm(String bumenname, Integer parentid) {
		return bumenMapper.xzbm(bumenname, parentid);
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

	// 通讯名录详情
	public List<Yuangong> cxtxmlxq() {
		return yuangongMapper.cxtxmlxq();
	}

	// 通讯名录修改
	public int uptxml(List<Yuangong> yuangong) {
		for (Yuangong wxyh : yuangong) {
			yuangongMapper.updateByPrimaryKey(wxyh);
		}
		return 1;
	}

	// 离职登记获取初始数据
	public List<Yuangong> querycssj() {
		return yuangongMapper.querycssj();
	}

	// 离职登记打开
	public Yuangong lzdjdk(String yuanno) {
		return yuangongMapper.lzdjdk(yuanno);
	}

	// 离职登记回滚
	public int lzdjhg(String yuanno) {
		lizhiMapper.delete(yuanno);// 离职登记回滚删除离职详情
		return yuangongMapper.lzdjhg(yuanno);
	}

	// 离职登记员工离职
	public int insertlzxq(Lizhi lizhi) {
		lizhiMapper.lzxqinsert(lizhi.getYuanno(), lizhi.getLizhitime(), lizhi.getRemark());// 离职登记新增离职详情
		return yuangongMapper.xglzzt(lizhi.getYuanno());
	}

	// 离职登记删除离职员工数据
	public int sclzygsj(String yuanno) {
		lizhiMapper.delete(yuanno);// 离职登记回滚删除离职详情
		return yuangongMapper.deleteByPrimaryKey(yuanno);
	}

	// 技工星级获取技工星级
	public List<Jigongstar> queryjgxj() {
		return jigongstarMapper.selectByExample(null);
	}

	// 技工星级新增
	public int insertjgxj(Jigongstar jigongstar) {
		return jigongstarMapper.insert(jigongstar);
	}

	// 技工星级修改
	public int upjgxj(Integer jistarid, String starname, String ticheng, Integer ids) {
		return jigongstarMapper.upjgxj(jistarid, starname, ticheng, ids);
	}

	// 技工星级删除
	public int deljgxj(Integer jistarid) {
		return jigongstarMapper.deleteByPrimaryKey(jistarid);
	}

	// 外勤车辆获取
	public List<Waiqingcar> querywqcl() {
		return waiqingcarMapper.selectByExample(null);
	}

	// 外勤车辆获取初始树状图数据
	public List<Jigongban> querybzszt() {
		return jigongbanMapper.selectByExample(null);
	}

	// 外勤车辆新增
	public int insertwcql(Waiqingcar waiqingcar) {
		return waiqingcarMapper.insert(waiqingcar);
	}

	// 修改外勤车辆
	public int upwqcl(String chepai, String carbank, String chexing, String nowli, Integer banid, String ids) {
		return waiqingcarMapper.upwqcl(chepai, carbank, chexing, nowli, banid, ids);
	}

	// 删除外勤车辆
	public int delwqcl(String chepai) {
		return waiqingcarMapper.deleteByPrimaryKey(chepai);
	}

	// 班组技工详情
	public List<Jigong> cxbzjgxq() {
		return jigongMapper.cxbzjgxq();
	}

	// 班组技工生成技工编号
	public Jigong newjigongno() {
		JigongExample example = new JigongExample();
		example.setOrderByClause("jigongno desc");
		List<Jigong> list = jigongMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	// 班组技工新增技工
	public int xzjg(Jigong jigong) {
		return jigongMapper.insert(jigong);
	}

	// 班组技工修改技工查询
	public Jigong bzjgxgcx(String jigongno) {
		return jigongMapper.selectByPrimaryKey(jigongno);
	}

	// 班组技工修改技工
	public int upjgxg(Jigong jigong) {
		return jigongMapper.updateByPrimaryKey(jigong);
	}

	// 班组技工删除技工
	@PostMapping("/deljg")
	public int deljg(String jigongno) {
		return jigongMapper.deleteByPrimaryKey(jigongno);
	}

	// 点击树状图获取班组在根据班组id查询技工详情
	public List<Jigong> djbzcxjg(Integer banid) {
		return jigongMapper.djbzcxjg(banid);
	}

	// 班组技工新增班组
	public int xzbz(String banname, Integer parentid) {
		return jigongbanMapper.xzbz(banname, parentid);
	}

}
