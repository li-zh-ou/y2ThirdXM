package com.accp.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.accp.domain.Yuangong;
import com.accp.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService ser;
	
	@PostMapping("/loginin")
	public Map<String, Object> loginin(String username, String password, HttpSession session) {
//		Yuangong yg=new Yuangong()
//		yg.setz(username);
//		yg.setPassword(password);
//		users = service.findByUsers(users);
//		if (users == null) {
//			return null;
//		}
//		session.setAttribute("user", users);
//		Map<String, Object> map = new HashMap<>();
//		map.put("user", users);
//		map.put("token", session.getId());
		return null;
	}
}
