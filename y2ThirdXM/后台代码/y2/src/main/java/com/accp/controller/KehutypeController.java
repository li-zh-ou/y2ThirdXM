package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Kehutype;
import com.accp.service.KehutypeService;

@RestController
public class KehutypeController {
	@Autowired
	KehutypeService ser;
	
	@GetMapping("/querytype")
	public List<Kehutype> querytype(){
		return ser.querytype();
	}
	
	@PostMapping("/addtype")
	public int addtype(@RequestBody Kehutype type){
		return ser.addtype(type);
	}
	@PostMapping("/updatetype")
	public int updatetype(@RequestBody Kehutype type) {
		return ser.updatetype(type);
	}
	@GetMapping("/deletetype")
	public int deletetype(int typeid) {
		return ser.deletetype(typeid);
	}
}
