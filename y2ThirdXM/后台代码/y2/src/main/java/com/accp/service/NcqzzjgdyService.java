package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.domain.Bumen;
import com.accp.domain.Gangwei;
import com.accp.mapper.BumenMapper;
import com.accp.mapper.GangweiMapper;

@Service
@Transactional
public class NcqzzjgdyService {
	
	@Autowired
	BumenMapper bumenMapper;
	
	@Autowired
	GangweiMapper gangweiMapper;
	
	//组织机构树状图查询
	public List<Bumen> querybm() {
		return bumenMapper.selectByExample(null);
	}
	
	//岗位定义查询
	public List<Gangwei> querygw(){
		return gangweiMapper.selectByExample(null);
	}
	
	//新增岗位
	public int insertgw(Gangwei gangwei) {
		return gangweiMapper.insert(gangwei);
	}
	
	//删除岗位
	public int delByIdgw(Integer gangweiid) {
		return gangweiMapper.deleteByPrimaryKey(gangweiid);
	}
	
	//修改岗位
	public int upgw(Integer gangweiid,String gangweiname,Integer ids) {
		return gangweiMapper.update(gangweiid,gangweiname,ids);
	}
	
	
}
