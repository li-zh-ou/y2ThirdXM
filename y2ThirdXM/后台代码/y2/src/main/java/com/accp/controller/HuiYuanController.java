package com.accp.controller;

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
	public PageInfo<Huiyuan> queryAllHuiYuan(int pageNum,int pageSize){
		return huiyuan.queryAllHuiYuan(pageNum,pageSize);
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
		System.out.println(where);
		return huiyuan.queryNoHuiYuan("%"+where+"%");
	}
}
