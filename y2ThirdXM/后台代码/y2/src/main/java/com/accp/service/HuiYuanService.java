package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Huiyuan;
import com.accp.domain.Kehu;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class HuiYuanService {

	@Autowired
	com.accp.mapper.HuiyuanMapper huiyuan;
	
	@Autowired
	com.accp.mapper.SaleMapper sale;
	
	@Autowired
	com.accp.mapper.KehuMapper kehu;
	
	public PageInfo<Huiyuan> queryAllHuiYuan(int pageNum,int pageSize){
		Page<Huiyuan> page=PageHelper.startPage(pageNum, pageSize);
		huiyuan.selectByExample(null);
		return page.toPageInfo();
	}
	
	public String chongZhi(Huiyuan cz) {
		System.out.println(cz.getHuiyuanmoney()+"="+cz.getHuiyuanno() );
		int czstuta = huiyuan.chongZhi(cz);
		return ""+czstuta;
	}
	
	public String yanQi(Integer money,String no) {
		int yqstuta = huiyuan.yanQi(money,no);
		return ""+yqstuta;
	}
	
	public String zhuXiao(String huiyuanno) {
		int zxstuta = huiyuan.deleteByPrimaryKey(huiyuanno);
		return ""+zxstuta;
	}
	
	public List<Kehu> queryNoHuiYuan(String where){
		
		
		return kehu.queryNoHuiYuan(where);
	}
}
