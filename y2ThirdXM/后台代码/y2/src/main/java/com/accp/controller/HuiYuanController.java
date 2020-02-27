package com.accp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Huiyuan;
import com.accp.domain.Kehu;
import com.accp.service.HuiYuanService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("huiyuan")
public class HuiYuanController {

	@Autowired
	HuiYuanService huiyuan;
	

	
	@RequestMapping("toHuiYuanGuanLi")
	public String toHuiYuanGuanLi() {
		return "lHuiYuanGuanLi";
	}
	
	@RequestMapping("queryAllHuiYuan")
	@ResponseBody
	public PageInfo<Huiyuan> queryAllHuiYuan(int pageNum,int pageSize,String hy,String phone,String order){
		if("".equals(hy)) {
			hy=null;
		}
		if("".equals(phone)) {
			phone=null;		
		}
		if("".equals(order)) {
			order=null;
		}
		return huiyuan.queryAllHuiYuan(pageNum, pageSize, hy, phone, order);
	}
	
	@RequestMapping("chongZhi")
	@ResponseBody
	public String chongZhi(@RequestBody Huiyuan cz) {
		return huiyuan.chongZhi(cz);
	}
	
	@RequestMapping("yanQi")
	@ResponseBody
	public String yanQi(Integer money,String no) {
		System.out.println(money+"="+no);
		return huiyuan.yanQi(money,no);
	}
	
	@RequestMapping("zhuXiao")
	@ResponseBody
	public String zhuXiao(String huiyuanno) {
		return huiyuan.zhuXiao(huiyuanno);
	}
	
	@RequestMapping("queryNoHuiYuan")
	@ResponseBody
	public List<Kehu> queryNoHuiYuan(String where) {
		return huiyuan.queryNoHuiYuan("%"+where+"%");
	}
	

	public String autoCreateNo(){
		StringBuffer no = new StringBuffer("HY");
		//获取当前时间年月日
		String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
		no.append(today);
		//获取今天生成的订单最大数，再加1
		String maxcount = ""+huiyuan.getTodayMaxCount(today);
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
	
	@RequestMapping("insertHuiYuan")
	@ResponseBody
	public String insertHuiYuan(@RequestBody Huiyuan record) {
		record.setHuiyuanno(autoCreateNo());
		return huiyuan.insertHuiYuan(record);
	}
	
	@RequestMapping("jiesuanQuery")
	@ResponseBody
	public Huiyuan jiesuanQuery(String wxdanno) {
		return huiyuan.jiesuanQuery(wxdanno);
	}
	
	@RequestMapping("jiesuanyanzheng")
	@ResponseBody
	public String  jiesuanyanzheng(String huiyuanno,String money){
		return huiyuan.jiesuanyanzheng(huiyuanno,money);
	}
}
