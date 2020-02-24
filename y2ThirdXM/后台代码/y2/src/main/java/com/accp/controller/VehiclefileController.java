package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.domain.Model_three_table_check1;
import com.accp.service.VehiclefileService;

@RestController
public class VehiclefileController {

	/**
	 *车型档案
	 */
	@Autowired
	VehiclefileService vehiclefileService;

	//进入车型档案
	@GetMapping("/vehiclefil1")
	public List<Carbrand> queryvehicle() {
		//左查
		List<Carbrand> list1=vehiclefileService.querySelect1();
		return list1;
	}
	
	//左边增加品牌
	@PostMapping("/vehiclefil2")
	public int queryvehicle2(@RequestBody Carbrand page1) {
		System.out.println("数据:"+page1.getCarbankname());
		return vehiclefileService.queryInsert1(page1);
	}
	
	//点击左边
	@PostMapping("/vehicleDjizb1")
	public List<Model_three_table_check1> queryvehDjzb(Integer CarBankId){
		System.out.println("点击左边:"+CarBankId);
		List<Model_three_table_check1> list=vehiclefileService.querySelect2(CarBankId);
		return list;
	}
	
	//左修改前查
	@PostMapping("/vehicleDjizb2")
	public Carbrand queryvehicleSelectUpdate1(Integer CarBankId1) {
		return vehiclefileService.querySeleUpdate(CarBankId1);
	}
	
	//修改
	@PostMapping("/vehicleDjizb3")
	public int queryvehicleUpdate1(@RequestBody Carbrand page1) {
		System.out.println("修改:"+page1.getCarbankname());
		return vehiclefileService.queryUpdate1(page1);
	}
	
	//删除
	@PostMapping("/vehicleDjizb4")
	public int queryvehicleDelete(Integer CarBankId1) {
		return vehiclefileService.queryDelete1(CarBankId1);
	}
	
	//右增加车型
	
	//右删除
	@PostMapping("/vehicleDjizb5")
	public int queryvehicleDelete2(Integer xingid) {
		return vehiclefileService.queryDelete2(xingid);
	}
	
}
