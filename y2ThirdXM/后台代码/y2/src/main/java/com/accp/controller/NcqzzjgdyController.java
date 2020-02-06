package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bumen;
import com.accp.domain.Gangwei;
import com.accp.service.NcqzzjgdyService;

@RestController
@RequestMapping("/ncq")
public class NcqzzjgdyController {
	
	@Autowired
	NcqzzjgdyService ncqzzjgdyService;
	
	//组织机构树状图查询
	@GetMapping("/querybm") 
	public List<Bumen> querybm() {
		return ncqzzjgdyService.querybm();
	}
	 
	//组织机构页面查询
	@GetMapping("/findBygw") 
	public Gangwei findBygw(Integer gangweiid) {
		return ncqzzjgdyService.findBygw(gangweiid);
	}
	 
	 //岗位定义查询
	@GetMapping("/querygw") 
	public List<Gangwei> querygw(){
		return ncqzzjgdyService.querygw();
	}
	
	//新增岗位
	@PostMapping("/insertgw")
	public int insertgw(Gangwei gangwei) {
		return ncqzzjgdyService.insertgw(gangwei);
	}
	
}
