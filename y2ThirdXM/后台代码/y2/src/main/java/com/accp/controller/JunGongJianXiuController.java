package com.accp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Jungong;
import com.accp.service.JunGongJianXiuService;

@Controller
@RequestMapping("jungongjianxiu")
public class JunGongJianXiuController {

	@Autowired
	JunGongJianXiuService jungong;
	
	@RequestMapping("toJunGongJianXiu")
	public String toJunGongJianXiu() {
		return "lJunGongJianXiu";
	}
	
	@RequestMapping("queryCiShu")
	@ResponseBody
	public String queryCiShu(String wxdanno) {
		return jungong.queryCiShu(wxdanno);
	}
	
	@RequestMapping("insertJunGong")
	@ResponseBody
	public String insertJunGong(@RequestBody Jungong jun) {
		if(jun.getYujitime()!=null) {
			jun.setYujitime(jun.getYujitime().replace('T', ' '));
		}
		if(jun.getShijitime()!=null) {
			jun.setShijitime(jun.getShijitime().replace('T', ' '));
		}
		return jungong.insertJunGong(jun);
	}
	
	
	
}
