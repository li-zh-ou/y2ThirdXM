package com.accp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Wxjiedan;
import com.accp.service.WeiXiuJieCheService;

@Controller
@RequestMapping("weixiujieche")
public class WeiXiuJieCheController {
	
	//单据类型拼音首字母
	static String dan = "WXD";
	
	@Autowired
	WeiXiuJieCheService wxjc;
	
	@RequestMapping("toWeiXiuJieChe")
	public String toWeiXiuJieChe() {
		return "lJieCheDengJi";
	}
	
	@RequestMapping("toWeiXiuDan")
	public String toWeiXiuDan() {
		return "lWeiXiuDan";
	}
	
	@RequestMapping("toZuoWeiXiuDan")
	public String toZuoWeiXiuDan() {
		return "lZuoWeiXiuDan";
	}

	@RequestMapping("totestToHtml")
	public String totestToHtml() {
		return "testToHtml";
	}
	
	/*@RequestMapping("queryZuoYeZhong")
	@ResponseBody
	public List<Wxjiedan> queryZuoYeZhong(){
		return wxjc.queryZuoYeZhong();
	}
	
	@RequestMapping("queryWxlishi")
	@ResponseBody
	public List<Wxjiedan> queryWxlishi(String chepai){
		return wxjc.queryWxlishi(chepai);
	}
	
	@RequestMapping("queryWXKehuInfo")
	@ResponseBody
	public Wxjiedan queryWXKehuInfo(String wxchepai){
		return wxjc.queryWXKehuInfo(wxchepai);
	}*/
	
	/*@RequestMapping("autoCreateNo")
	@ResponseBody
	public String autoCreateNo(){
		StringBuffer no = new StringBuffer("WXD");
		//获取当前时间年月日
		String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
		no.append(today);
		//获取今天生成的订单最大数，再加1
		String maxcount = wxjc.getTodayMaxCount(today);
		//后加订单数量作为尾数。判断补零
		switch (maxcount.length()) {
		case 1:
			no.append("000"+maxcount);
			break;
		case 2:
			no.append("00"+maxcount);
			break;
		case 3:
			no.append("0"+maxcount);
			break;
		default:
			no.append(maxcount);
			break;
		}
		return no.toString();
	}
	
	@RequestMapping("oldwxJieDan")
	@ResponseBody
	public Wxjiedan oldwxJieDan(String wxdanno){
		return wxjc.oldwxJieDan(wxdanno);
	}
	
	@RequestMapping("newwxJieDan")
	@ResponseBody
	public Wxjiedan newwxJieDan(String chepai){
		return wxjc.newwxJieDan(chepai);
	}
	
	@RequestMapping("insertWXdan")
	@ResponseBody
	public String insertWXdan(@RequestBody Wxjiedan wxdan){
		return wxjc.insertWXdan(wxdan);
	}
	
	@RequestMapping("queryJunGong")
	@ResponseBody
	public List<Wxjiedan> queryJunGong(String wxdanno,String chepai,String danjustatu,String pretime,String nexttime){
		return wxjc.queryJunGong(wxdanno, chepai, danjustatu, pretime, nexttime);
	}*/
}
