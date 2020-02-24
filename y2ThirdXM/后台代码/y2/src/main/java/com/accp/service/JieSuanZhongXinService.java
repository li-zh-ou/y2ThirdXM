package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Wxjiedan;

@Service
public class JieSuanZhongXinService {

	@Autowired
	com.accp.mapper.WxjiedanMapper wxjiedan;
	
	public List<Wxjiedan> queryJieSuan(String wxdanno,String starttime,String endtime,String jiesuanstatu,String danjustatu,String chepai,String kehuname,String guwen,String yewutype,String remark){
		return wxjiedan.queryJieSuan(wxdanno, starttime, endtime, jiesuanstatu, danjustatu, chepai, kehuname, guwen, yewutype, remark);
	}
	
}
