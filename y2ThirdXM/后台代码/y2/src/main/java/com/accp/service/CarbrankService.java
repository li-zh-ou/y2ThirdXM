package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Carbrand;
import com.accp.domain.Carxing;
import com.accp.domain.CarxingExample;
import com.accp.domain.Fadongbrand;
import com.accp.domain.Kehu;
import com.accp.domain.Kehucar;
import com.accp.mapper.CarbrandMapper;
import com.accp.mapper.CarxingMapper;
import com.accp.mapper.FadongbrandMapper;
import com.accp.mapper.KehuMapper;
import com.accp.mapper.KehucarMapper;

@Service
@Transactional
public class CarbrankService {
	
	@Autowired
	CarbrandMapper carbrankmapper;
	
	@Autowired
	CarxingMapper carxingmapper;
	
	@Autowired
	FadongbrandMapper fadongmapper;
	
	@Autowired
	KehuMapper kehumapper;
	
	@Autowired
	KehucarMapper kehucarmapper;
	
	public List<Carbrand> querycarbrank(){
		return carbrankmapper.selectByExample(null);
	}
	
	public List<Carxing> querybycarbrandid(int carbrandid){
		CarxingExample example=new CarxingExample();
		example.createCriteria().andCarbankidEqualTo(carbrandid);
		return carxingmapper.selectByExample(example);
	}
	
	public List<Fadongbrand> queryfadoji() {
		return fadongmapper.selectByExample(null);
	}
	
	public int addkehuandche(Kehu kehu) {
		int count=kehumapper.insert(kehu);
		Kehu k=kehumapper.selectByPrimaryKey(kehu.getKehuid());
		kehu.getCar().setKehuno(k.getKehuno());
		return kehucarmapper.insert(kehu.getCar());
	}
	public int addcar(Kehucar car) {
		return kehucarmapper.insert(car);
	}
	public int updatecar(Kehucar car) {
		return kehucarmapper.updateByPrimaryKey(car);
	}
	
	public int deletecar(String chepai) {
		return kehucarmapper.deleteByPrimaryKey(chepai);
	}
}
