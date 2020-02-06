package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carbrand;
import com.accp.domain.Carxing;
import com.accp.domain.CarxingExample;
import com.accp.domain.Fadongbrand;
import com.accp.mapper.CarbrandMapper;
import com.accp.mapper.CarxingMapper;
import com.accp.mapper.FadongbrandMapper;

@Service
@Transactional
public class CarbrankService {
	
	@Autowired
	CarbrandMapper carbrankmapper;
	
	@Autowired
	CarxingMapper carxingmapper;
	
	@Autowired
	FadongbrandMapper fadongmapper;
	
	public List<Carbrand> querycarbrank(){
		return carbrankmapper.selectByExample(null);
	}
	
	public List<Carxing> querybycarbrandid(int carbrandid){
		CarxingExample example=new CarxingExample();
		example.createCriteria().andCarbankidEqualTo(carbrandid);
		return carxingmapper.selectByExample(example);
	}
	
	public Fadongbrand querybyfabankid(int fabankid) {
		return fadongmapper.selectByPrimaryKey(fabankid);
	}
}
