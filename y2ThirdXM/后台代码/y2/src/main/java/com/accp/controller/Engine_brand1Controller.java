package com.accp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Fadongbrand;
import com.accp.service.Engine_brand1;

@RestController
@RequestMapping("student_Engine1")
public class Engine_brand1Controller {

		//发动机品牌
	@Autowired
	Engine_brand1 engine_brand1;
	
	//进入发动机品牌页
	@GetMapping(value = "enginSe1")
	public List<Fadongbrand> queryenginjru() {
		List<Fadongbrand> list=engine_brand1.queryFadSelect1();
		return list;
	}
	
	//新增
	@PostMapping(value="enginIn1")
	public int queryengInsert1(@RequestBody Fadongbrand inse) {
		System.out.println("新增方法:"+inse);
		return engine_brand1.queryFadInsert1(inse);
	}
	
	//删除
	@PostMapping(value = "enginDe1")
	public int queryengDelete1(Integer fabankid) {
		System.out.println("a删除:"+fabankid);
		return engine_brand1.queryFadDelete1(fabankid);
	}
	
	//修前
	@PostMapping(value = "enginSe2")
	public Fadongbrand queryengUpdateSele(Integer fabankid) {
		return engine_brand1.queryFadUpdateSele(fabankid);
	}
	
	//修改
	@PutMapping(value = "enginUp1")
	public int queryengUpdate(@RequestBody Fadongbrand inse) {
		System.out.println("修改:"+inse);
		return engine_brand1.queryFadUpdate(inse);
	}
}
