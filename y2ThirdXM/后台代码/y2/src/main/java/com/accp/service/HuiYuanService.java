package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.core.RecordCreator;
import org.springframework.stereotype.Service;

import com.accp.domain.Huiyuan;
import com.accp.domain.HuiyuanExample;
import com.accp.domain.HuiyuanExample.Criteria;
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
	
	public PageInfo<Huiyuan> queryAllHuiYuan(int pageNum,int pageSize,String hy,String phone,String order){
		Page<Huiyuan> page=PageHelper.startPage(pageNum, pageSize);
		huiyuan.queryAllHuiYuan(hy, phone, order);
		return page.toPageInfo();
	}
	
	public String chongZhi(Huiyuan cz) {
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
	
	public String insertHuiYuan(Huiyuan record) {
		return ""+ huiyuan.insertHuiYuan(record);
				
	}
	
	public Integer getTodayMaxCount(String today) {
		return huiyuan.getTodayMaxCount(today);
	}
	
	public Huiyuan jiesuanQuery(String wxdanno) {
		huiyuan.shenjihuangji();
		huiyuan.shenjizuanshi();
		return huiyuan.jiesuanQuery(wxdanno);
	}
	
	public String jiesuanyanzheng(String huiyuanno,String money) {
		int num = 0;
		if(huiyuan.jiesuanyzTime(huiyuanno)>0) {
			num = num+1;
		}
		if(huiyuan.jiesuanyzMoney(huiyuanno, money)>0) {
			num = num+2;
		}
		return ""+num;
	}
	
	public String updateUhuXiao(String huiyuanno) {
		int zxstuta = huiyuan.updateUhuXiao(huiyuanno);
		return ""+zxstuta;
	}
}
