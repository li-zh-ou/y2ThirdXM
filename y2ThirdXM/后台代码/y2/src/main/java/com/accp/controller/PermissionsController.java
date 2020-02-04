package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Permissions;
import com.accp.service.PermissionsService;

@RestController
public class PermissionsController {

	@Autowired
	PermissionsService permService;

	/**
	 * 有级联
	 * @param sessions
	 * @return
	 */
	@GetMapping("/find")
	public List<Permissions> find(String ZhiwuId){
		System.out.println(ZhiwuId);
//		Users user = (Users)sessions.getAttribute("user");
		return permService.findEachByZhiwuId(ZhiwuId);
	}
}
