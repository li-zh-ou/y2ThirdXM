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

import com.accp.domain.Wxxdbiao;
import com.accp.domain.Wxxiangmu;
import com.accp.domain.wxxia_wxshou1;
import com.accp.service.Maintenance_items1;

@RestController
public class Maintenance_items1Config {

	//维修项目
	@Autowired
	Maintenance_items1 maintenance_items1;
	
	//左边树形结构图maintenance1
	@GetMapping("/maintenance1")
	public List<Wxxdbiao> querySelect1(){
		System.out.println("生成左边树的数据！！！");
		List<Wxxdbiao> list=maintenance_items1.queryWxxiaSelect2();
		return list;
	}
	
	//点击左边显示右边
	@GetMapping(value="maintenance2")
	public List<wxxia_wxshou1> querySelect2(String pname){
		System.out.println("数据:"+pname);
		List<wxxia_wxshou1> list=maintenance_items1.queryWxxiangSelect1(pname);
		return list;
	}
	
	//删除
	@PostMapping("/maintenance6")
	public int queryDelete1(String xiangmuno) {
		System.out.println("删除:"+xiangmuno);
		return maintenance_items1.queryWxxiaDelete1(xiangmuno);
	}
	
	//新增
	@PostMapping("/maintenance3")
	public int queryInsert1(Wxxiangmu dataa) {
		System.out.println("新增:"+dataa.getXiangmuname());
		return maintenance_items1.queryWxxiaInsele(dataa);
	}
	
	//修前查
	@PostMapping("/maintenance4")
	public wxxia_wxshou1 querySelect3(String xiangmuno) {
		System.out.println("修改前面:"+xiangmuno);
		wxxia_wxshou1 list=maintenance_items1.queryWxxiaSelect3(xiangmuno);
		System.out.println();
		return list;
	}
	
	//修改
	@PutMapping("/maintenance5")
	public int queryUpdate1(@RequestBody Wxxiangmu dataa12) {
		System.out.println("修改："+dataa12.getXiangmuno());
		return maintenance_items1.queryWxxiaUpdate1(dataa12);
	}
}
