package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Huoshang;
import com.accp.domain.HuoshangExample;
import com.accp.domain.Huoshuxjg;
import com.accp.mapper.HuoshangMapper;
import com.accp.mapper.HuoshuxjgMapper;

@Service
@Transactional
public class Supply_unitService1 {

	//供货单位页面
	@Autowired
	HuoshuxjgMapper huoshuxjgMapper;
	
	@Autowired
	HuoshangMapper huoshangMapper;
	//左树型结构图
	
	public List<Huoshuxjg> querySupplySelect1(){
		return huoshuxjgMapper.selectByExample(null);
	}
	
	//点击左边
	public List<Huoshang> querySupplySelect2(String bei1){
		HuoshangExample huoshangexamo=new HuoshangExample();
		huoshangexamo.createCriteria().andBei1EqualTo(bei1);
		return huoshangMapper.selectByExample(huoshangexamo);
	}
	
	//点击数据
	public Huoshang querySupplySelect3(String huoshangno) {
		return huoshangMapper.selectByPrimaryKey(huoshangno);
	}
	
	//删除右
	public int querySupplyDelete1(String huoshangno) {
		return huoshangMapper.deleteByPrimaryKey(huoshangno);
	}
}
