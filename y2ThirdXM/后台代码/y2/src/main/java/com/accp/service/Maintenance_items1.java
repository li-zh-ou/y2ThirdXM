package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Wxxdbiao;
import com.accp.domain.Wxxiangmu;
import com.accp.domain.WxxiangmuExample;
import com.accp.domain.wxxia_wxshou1;
import com.accp.mapper.WxxdbiaoMapper;
import com.accp.mapper.WxxiangmuMapper;

@Service
@Transactional
public class Maintenance_items1 {

	//维修项目
	@Autowired
	WxxiangmuMapper wxxiangmuMapper;
	//树表wxxdbiao
	@Autowired
	WxxdbiaoMapper wxxdbiaoMapper;
	
	//点击左边显示右边数据
	public List<wxxia_wxshou1> queryWxxiangSelect1(String pname){
		System.out.println("这里1："+pname);
		List<wxxia_wxshou1> list=wxxiangmuMapper.querywxxwxSelect1(pname);
		System.out.println("这里2:"+pname);
		return list;
	}
	
	//显示左边树形结构图
	public List<Wxxdbiao> queryWxxiaSelect2(){
		return wxxdbiaoMapper.selectByExample(null);
	}
	
//	public List<Wxxiangmu> queryWxxiaSelect2(){
//		return wxxiangmuMapper.selectByExample(null);
//	}
	
	//删除XingMuType
	public int queryWxxiaDelete1(String xinmutype) {
		WxxiangmuExample wxxiagmuexample=new WxxiangmuExample();
		wxxiagmuexample.createCriteria().andXingmutypeEqualTo(xinmutype);
		return wxxiangmuMapper.deleteByPrimaryKey(xinmutype);
	}
	
	//新增
	public int queryWxxiaInsele(Wxxiangmu wxxiangmu) {
		System.out.println(wxxiangmu.getClass());
		return wxxiangmuMapper.insert(wxxiangmu);
	}
	
	//修改前查
	public wxxia_wxshou1 queryWxxiaSelect3(String XiangMuNo) {
		return wxxiangmuMapper.querywxxwxSelect2(XiangMuNo);
	}
	
	//修改
	public int queryWxxiaUpdate1(Wxxiangmu wxxiangmu) {
		return wxxiangmuMapper.updateByPrimaryKey(wxxiangmu);
	}
}
