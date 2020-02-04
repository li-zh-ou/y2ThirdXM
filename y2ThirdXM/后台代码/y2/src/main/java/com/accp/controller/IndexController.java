package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Yuangong;
import com.accp.domain.Zhiwu;
import com.accp.service.IndexService;

@RestController
public class IndexController {
	@Autowired
	IndexService ser;
	
	@GetMapping("/toIndex")
	public Yuangong toindex(String Yuanno) {
		return ser.query(Yuanno);
	}
}
