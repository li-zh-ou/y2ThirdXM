package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Kehu;
import com.accp.domain.Kehucar;
import com.accp.service.KehuinfoService;

@RestController
public class KehuinfoController {
	
	@Autowired
	KehuinfoService ser;
	
	@GetMapping("/querykehu")
	public List<Kehu> QueryKehu(){
		return ser.QueryKehu();
	}
	@GetMapping("/querybykehuno")
	public List<Kehucar> QueryBykehuno(String kehuno){
		System.out.println(kehuno);
		return ser.QueryBykehuno(kehuno);
	}
}
