package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Jungong;

@Service
public class JunGongJianXiuService {

	@Autowired
	com.accp.mapper.JungongMapper jungong;
	
	public String queryCiShu(String wxdanno) {
		return ""+jungong.queryCiShu(wxdanno);
	}
	
	public String insertJunGong(Jungong jun) {
		Integer num =0;
		if(jungong.insertJunGong(jun)>0) {
			num = jungong.updatestatu(jun.getShijitime(),jun.getWxdanno());
		}
		return ""+num;
	}
}
