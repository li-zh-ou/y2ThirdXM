package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/findperm")
	public List<Permissions> findperm(){
//		Users user = (Users)sessions.getAttribute("user");
		return permService.findperm();
	}
	@GetMapping("/findpermbu")
	public List<Permissions> findpermbu(String zhiwuid){
//		Users user = (Users)sessions.getAttribute("user");
		return permService.findperbu(zhiwuid);
	}
	@PostMapping("/addquanxian")
	public int addquanxian(@RequestBody List<Permissions> checked,int zhiwuid) {
		return permService.addquanxian(checked,zhiwuid);
	}
	@GetMapping("/findPerms")
	public List<Permissions> findPermssions(HttpSession sessions){
		return permService.findByzhiwuid("1");
	}
}
