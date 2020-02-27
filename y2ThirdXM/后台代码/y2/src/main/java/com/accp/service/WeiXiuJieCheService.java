package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Huiyuan;
import com.accp.domain.Kehucar;
import com.accp.domain.Wxjiedan;
import com.accp.domain.Wxxiangmu;

@Service
public class WeiXiuJieCheService {
	
	@Autowired
	com.accp.mapper.WxjiedanMapper wxjiedan;
	
	@Autowired
	com.accp.mapper.WxxiangmuMapper xiangmu;
	
	@Autowired
	com.accp.mapper.HuiyuanMapper huiyuan;
	
	@Autowired
	com.accp.mapper.KehucarMapper khcar;
	
	public List<Wxjiedan> queryZuoYeZhong(){
		return wxjiedan.queryZuoYeZhong();
	}
	
	public List<Wxjiedan> queryWxlishi(String chepai){
		return wxjiedan.queryWxlishi(chepai);
	}
	
	public Wxjiedan queryWXKehuInfo(String wxchepai){
		return wxjiedan.queryWXKehuInfo(wxchepai);
	}
	
	public String getTodayMaxCount(String today) {
		return wxjiedan.getTodayMaxCount(today);
	}
	
	public Wxjiedan oldwxJieDan(String wxdanno) {
		return wxjiedan.oldwxJieDan(wxdanno);
	}
	
	public Wxjiedan newwxJieDan(String chepai) {
		return wxjiedan.newwxJieDan(chepai);
	}

	public String insertWXdan(Wxjiedan dan) {
		Integer num =0;
		if(wxjiedan.queryByPrimaryKeyCount(dan.getWxdanno())<1) {
			num = wxjiedan.insertwxdan(dan);
			wxjiedan.jinrijieche();
		}
		else {
			wxjiedan.updateByPrimaryKey(dan);
		}
		return "" + num;
	}
	
	public List<Wxjiedan> queryJunGong(String wxdanno,String chepai,String danjustatu,String pretime,String nexttime){
		return wxjiedan.queryJunGong(wxdanno, chepai, danjustatu, pretime, nexttime);
	}
	
	public List<Wxxiangmu> queryAllXiangMu(String[] nos){
		List<Wxxiangmu> list=new ArrayList<Wxxiangmu>();
		for (int i = 0; i < nos.length; i++) {
			list.add(xiangmu.selectByPrimaryKey(nos[i]));
		}
		return list;
	}
	
	public List<Wxxiangmu> queryXinagMu(String no){
		Wxjiedan jiedan = wxjiedan.selectByPrimaryKey(no);
		String bei3 =jiedan.getBei3();
		jiedan=null;
		List<Wxxiangmu> list=new ArrayList<Wxxiangmu>();
		if(("").equals(bei3) || bei3 == null) {
			
		}else {
			String [] nos = bei3.split(",");
			for (int i = 0; i < nos.length; i++) {
				list.add(xiangmu.selectByPrimaryKey(nos[i]));
			}
			nos = null;
			bei3 = null;
		}
		return list;
	}
		
	public List<Wxxiangmu> queryXinagMuBybei3(String xmji) {
		String [] nos = xmji.split(",");
		List<Wxxiangmu> list=new ArrayList<Wxxiangmu>();
		for (int i = 0; i < nos.length; i++) {
			list.add(xiangmu.selectByPrimaryKey(nos[i]));
		}
		nos = null;
		return list;
	}
	
	public Huiyuan xiaopiao(String chepai) {
		return huiyuan.xiaopiao(chepai);
	}
	
	public List<Kehucar> queryKeHuCar(String chepai){
		return khcar.queryKeHuCar(chepai);
	}
	
	public List<Wxxiangmu> querywxXiangMu(){
		return xiangmu.selectByExample(null);
	}
	
	public String jiesuanInsert(Double money,String wxdanno,String huiyuanno,String jiesuantype) {
		huiyuan.jiesuanUpdate(huiyuanno,money);
		wxjiedan.jiesuanUpdate(wxdanno,money,jiesuantype);
		wxjiedan.jinrishouru(money, jiesuantype);
		wxjiedan.jiesuantaici();
		return "";
	}
}
