package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Bumen;
import com.accp.service.NcqzzjgdyService;

@RestController
public class NcqzzjgdyController {
	
	@Autowired
	NcqzzjgdyService ncqzzjgdyService;
	
	/*
	 * @GetMapping("/toquerybm") public Bumen querybm() { return
	 * ncqzzjgdyService.querybm(); }
	 */
	
}
