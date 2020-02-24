package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.domain.Carbrand;
import com.accp.domain.CarbrandExample;
import com.accp.domain.Carxing;
import com.accp.domain.Model_three_table_check1;
import com.accp.mapper.CarbrandMapper;
import com.accp.mapper.CarxingMapper;

@Service
@Transactional
public class VehiclefileService {

	//	车型档案
		
		//汽车品牌表
		@Autowired
		CarbrandMapper carbrandMapper;
		//车型表
		@Autowired
		CarxingMapper carxingMapper;
		
//		品牌车型左边查询显示
		public List<Carbrand> querySelect1(){
			return carbrandMapper.selectByExample(null);
		}
		
		//点击左边显示右边信息
		public List<Model_three_table_check1> querySelect2(Integer CarBankId){
			List<Model_three_table_check1> list=carxingMapper.modelchexbSelect1(CarBankId);
			return list;
		}
		
		//左边按条件查询 
		public List<Carbrand> querySelect3(String select_name_name1){
			CarbrandExample carbrandexample=new CarbrandExample();
			carbrandexample.createCriteria().andCarbanknameEqualTo(select_name_name1);
			return carbrandMapper.selectByExample(carbrandexample);
		}
		
		//左边增加品牌
		public int queryInsert1(@RequestBody Carbrand insertCarbrand1) {
			return carbrandMapper.insert(insertCarbrand1);
		}
		
		//左边修改前查
		public Carbrand querySeleUpdate(Integer CarBankId1) {
			return carbrandMapper.selectByPrimaryKey(CarBankId1);
		}
		
		//左修改
		public int queryUpdate1(Carbrand CarBankId1) {
			CarbrandExample carbrandexample=new CarbrandExample();
			return carbrandMapper.updateByPrimaryKey(CarBankId1);
		}
		
		//左删除
		public int queryDelete1(Integer CarBankId1) {
			CarbrandExample carbrandexample=new CarbrandExample();
			carbrandexample.createCriteria().andCarbankidEqualTo(CarBankId1);
			return carbrandMapper.deleteByExample(carbrandexample);
		}
		
		//右增加车型里选择内容
		public List<Carxing> querySelect2(){
			List<Carxing> list=carxingMapper.selectByExample(null);
			return list;
		}
		
		//右增加车型
		
		
		//右修改车型
		
		//删除
		public int queryDelete2(Integer xingid) {
			return carxingMapper.deleteByPrimaryKey(xingid);
		}
}
