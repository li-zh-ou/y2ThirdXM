package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Carbrand;
import com.accp.domain.Carxing;
import com.accp.domain.Fadongbrand;
import com.accp.domain.Kehu;
import com.accp.domain.Kehucar;
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
	
	@GetMapping("/queryfadoji")
	public List<Fadongbrand> queryfadoji() {
		return ser.queryfadoji();
	}
	@PostMapping("/addkehuandche")
	public int addkehuandche(@RequestBody Kehu kehu) {
		return ser.addkehuandche(kehu);
	}
}
