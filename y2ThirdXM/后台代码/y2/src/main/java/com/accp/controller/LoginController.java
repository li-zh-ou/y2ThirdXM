package com.accp.controller;

import java.util.HashMap;
import java.util.List;
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
		Yuangong yg=new Yuangong();
		yg.setLogin(username);
		yg.setBei4(password);
		List<Yuangong> ss = ser.queryby(yg);
		if (ss.size() == 0) {
			return null;
		}
		session.setAttribute("yg", ss.get(0));
		Map<String, Object> map = new HashMap<>();
		map.put("user", ss.get(0));
		map.put("token", session.getId());
		return map;
	}
}
