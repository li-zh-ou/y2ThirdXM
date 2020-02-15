package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Zhiwu;
import com.accp.service.ZhiwuService;

@RestController
public class ZhiwuController {
	@Autowired
	ZhiwuService ser;
	
	@GetMapping("/queryzhiwu")
	public List<Zhiwu> queryzhiwu(){
		return ser.queryzhiwu();
	}
	@PostMapping("/addzhiwu")
	public int addzhiwu(@RequestBody Zhiwu zhiwu) {
		return ser.addzhiwu(zhiwu);
	}
	@PostMapping("/updatezhiwu")
	public int updatezhiwu(@RequestBody Zhiwu zhiwu) {
		return ser.updatezhiwu(zhiwu);
	}
}
