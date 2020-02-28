package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goods;
import com.accp.service.Commodity_service1;

@RestController
public class Commodity_controller1 {

	
	//商品资料页面
	@Autowired
	Commodity_service1 commodity_service1;
	
	//进入页面显示
	@GetMapping("/commodityxs1")
	public List<Goods> queryCommodity1(){
		return commodity_service1.queryGooSelect1();
	}
	
	//右上角查
	@GetMapping("/commodityxs2")
	public List<Goods> queryCommodity2(String GoodsName){
		return commodity_service1.queryGooSelect2(GoodsName);
	}
	
	//点击
	@PostMapping("/commodityxs3")
	public Goods queryCommodity4(Integer goodsid){
		System.out.println("点击:"+goodsid);
		return commodity_service1.queryGooSelect3(goodsid);
	}
	
	//删除
	@PostMapping("/commodityxs4")
	public int queryCommodity3(Integer goodsid) {
		return commodity_service1.queryGooDelete1(goodsid);
	}
	
	//增加
	@PostMapping("/commodityxs5")
	public int queryCommodity4(@RequestBody Goods page3) {
		return commodity_service1.queryGooInsert1(page3);
	}
	
	//修改
	@PostMapping("/commodityxs6")
	public int queryCommodity5(@RequestBody Goods goods) {
		return commodity_service1.queryGooUpdate1(goods);
	}
}
