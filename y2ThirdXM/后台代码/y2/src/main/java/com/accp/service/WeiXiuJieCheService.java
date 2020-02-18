package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Wxjiedan;
import com.accp.domain.Wxxiangmu;

@Service
public class WeiXiuJieCheService {
	
	@Autowired
	com.accp.mapper.WxjiedanMapper wxjiedan;
	
	@Autowired
	com.accp.mapper.WxxiangmuMapper xiangmu;
	
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
		return "" + wxjiedan.insertwxdan(dan);
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
		
}
