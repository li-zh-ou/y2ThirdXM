package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.domain.Carxing;
import com.accp.domain.Fadongbrand;
import com.accp.service.CarbrankService;

@RestController
public class CarbrankController {
	@Autowired
	CarbrankService ser;
	
	@GetMapping("/querycarbrank")
	public List<Carbrand> querycarbrank(){
		return ser.querycarbrank();
	}
	
	@GetMapping("/querybycarbrandid")
	public List<Carxing> querybycarbrandid(int carbrandid){
		return ser.querybycarbrandid(carbrandid);
	}
	
	@GetMapping("/querybyfabankid")
	public Fadongbrand querybyfabankid(int fabankid) {
		return ser.querybyfabankid(fabankid);
	}
}
