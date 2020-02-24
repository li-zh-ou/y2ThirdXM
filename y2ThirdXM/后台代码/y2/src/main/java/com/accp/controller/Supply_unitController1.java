package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Huoshang;
import com.accp.domain.Huoshuxjg;
import com.accp.service.Supply_unitService1;

@RestController
public class Supply_unitController1 {

	//供货单位页面
	@Autowired
	Supply_unitService1 supply_unitService1;
	
	//左边树型结构图
	@GetMapping("/supplyunit1")
	public List<Huoshuxjg> querySelect1(){
		return supply_unitService1.querySupplySelect1();
	}
	
	//点击左边查
	@GetMapping("/supplyunit2")
	public List<Huoshang> querySelect2(String bei1){
		System.out.println("数据:"+bei1);
		return supply_unitService1.querySupplySelect2(bei1);
	}
	
	//右点
	@PostMapping("/supplyunit3")
	public Huoshang querySelect3(String huoshangno) {
		return supply_unitService1.querySupplySelect3(huoshangno);
	}
	
	//右删
	@PostMapping(value = "supplyunit4")
	public int queryDelete1(String huoshangno) {
		System.out.println("删除:"+huoshangno);
		return supply_unitService1.querySupplyDelete1(huoshangno);
	}
}
