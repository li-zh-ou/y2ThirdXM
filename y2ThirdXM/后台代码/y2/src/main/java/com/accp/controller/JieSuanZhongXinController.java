package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Huiyuan;
import com.accp.domain.Wxjiedan;
import com.accp.domain.Wxxiangmu;
import com.accp.service.JieSuanZhongXinService;
import com.accp.service.WeiXiuJieCheService;

@Controller
@RequestMapping("jiesuanzhongxin")
public class JieSuanZhongXinController {
	
	@Autowired 
	JieSuanZhongXinService jszxservice;
	
	@Autowired
	WeiXiuJieCheService wxjc;
	
	@RequestMapping("toJieSuanZhongXin")
	public String toJieSuanZhongXin() {
		return "lJieSuanZhongXin";
	}
	
	@RequestMapping("toXiaoPiao")
	public String toXiaoPiao() {
		return "lXiaoPiao";
	}
	
	@RequestMapping("queryJieSuan")
	@ResponseBody
	public List<Wxjiedan> queryJieSuan(String wxdanno,String starttime,String endtime,String jiesuanstatu,String danjustatu,String chepai,String kehuname,String guwen,String yewutype,String remark){
		return jszxservice.queryJieSuan(wxdanno, starttime, endtime, jiesuanstatu, danjustatu, chepai, kehuname, guwen, yewutype, remark);
	}
	
	@RequestMapping("queryXiangMu")
	@ResponseBody
	public List<Wxxiangmu> queryXinagMuBybei3(String danno){
		return wxjc.queryXinagMu(danno);
	}
	
	@RequestMapping("xiaopiao")
	@ResponseBody
	public Huiyuan xiaopiao(String chepai){
		return wxjc.xiaopiao(chepai);
	}
	
}
