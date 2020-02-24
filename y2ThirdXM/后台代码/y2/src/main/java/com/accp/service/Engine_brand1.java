package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Fadongbrand;
import com.accp.mapper.FadongbrandMapper;

@Service
@Transactional
public class Engine_brand1 {

//	发动机品牌
	
	//发动机品牌表
	@Autowired
	FadongbrandMapper fadongbrandMapper;
	
	//发动机品牌查询全部
	public List<Fadongbrand> queryFadSelect1(){
		List<Fadongbrand> list=fadongbrandMapper.selectByExample(null);
		return list;
	}
	
	//发动机品牌新增数据
	public int queryFadInsert1(Fadongbrand fadong) {
		return fadongbrandMapper.insert(fadong);
	}
	
	//删除
	public int queryFadDelete1(Integer fabankid) {
		return fadongbrandMapper.deleteByPrimaryKey(fabankid);
	}
	
	//修改前
	public Fadongbrand queryFadUpdateSele(Integer fabankid) {
		return fadongbrandMapper.selectByPrimaryKey(fabankid);
	}
	
	//修改
	public int queryFadUpdate(Fadongbrand fadong) {
		System.out.println("修改:"+fadong);
		return fadongbrandMapper.updateByPrimaryKey(fadong);
	}
}
