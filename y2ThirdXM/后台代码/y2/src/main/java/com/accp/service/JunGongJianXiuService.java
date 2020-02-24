package com.accp.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Jungong;
import com.accp.domain.Wxjiedan;

@Service
public class JunGongJianXiuService {

	@Autowired
	com.accp.mapper.JungongMapper jungong;
	
	@Autowired
	com.accp.mapper.WxjiedanMapper wxjiedan;
	
	
	public String queryCiShu(String wxdanno) {
		return ""+jungong.queryCiShu(wxdanno);
	}
	
	public String insertJunGong(Jungong jun) {
		Integer num =0;
		Wxjiedan wx = wxjiedan.selectByPrimaryKey(jun.getWxdanno());
		if("false".equals(jun.getIshege())) {
			if(wx.getBei4() == null || "".equals(wx.getBei4())) {
				jun.setBei1("FG"+jun.getWxdanno());
			}else {
				jun.setBei1(wx.getBei4());
			}
		}
		num = jungong.insertJunGong(jun);
		String no = null;
		if(num>0) {
			num = jungong.updatestatu(jun.getShijitime(),jun.getWxdanno());
			if("false".equals(jun.getIshege())) {
				no = autoCreateNo();
				wx.setWxdanno(no);
				wx.setDanjustatu("作业中");
				wx.setYujitime(null);
				wx.setKaidantime(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
				wx.setWangongtime(null);
				wx.setWangongtime(null);
				wx.setBei1("未结算");
				wx.setBei4(jun.getBei1());
				wxjiedan.insert(wx);
			}
		}
		jun = null;
		wx = null;
		if(no !=null) {
			return no;
		}
		else {
			return ""+num;
		}
	}
	
	public String autoCreateNo(){
		StringBuffer no = new StringBuffer("WXD");
		//获取当前时间年月日
		String today = new SimpleDateFormat("yyyyMMdd").format(new Date());
		no.append(today);
		//获取今天生成的订单最大数，再加1
		String maxcount = wxjiedan.getTodayMaxCount(today);
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
}
