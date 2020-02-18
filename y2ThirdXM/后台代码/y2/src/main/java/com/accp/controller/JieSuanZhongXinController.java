package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jiesuanzhongxin")
public class JieSuanZhongXinController {
	
	@RequestMapping("toJieSuanZhongXin")
	public String toJieSuanZhongXin() {
		return "lJieSuanZhongXin";
	}
	
	
}
