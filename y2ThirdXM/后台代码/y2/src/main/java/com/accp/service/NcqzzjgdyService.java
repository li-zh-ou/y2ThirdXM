package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
//	public Bumen querybm() {
//		return bumenMapper.selectByPrimaryKey(null);
//	}
	
	//岗位定义查询
	public List<Gangwei> querygw(){
		return gangweiMapper.selectByExample(null);
	}
	
	//新增岗位
	public int insertgw(Gangwei gangwei) {
		return gangweiMapper.insert(gangwei);
	}
	
}
