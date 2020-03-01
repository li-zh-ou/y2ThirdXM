package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Goods;
import com.accp.domain.GoodsExample;
import com.accp.mapper.GoodsMapper;

@Service
@Transactional
public class Commodity_service1 {

	@Autowired
	GoodsMapper goodsMapper;
	
//	商品资料页
	
	//显示查询
	public List<Goods> queryGooSelect1(){
		return goodsMapper.selectByExample(null);
	}
	
	//右上角查询
	public List<Goods> queryGooSelect2(String GoodsName) {
		GoodsExample goodsem=new GoodsExample();
		goodsem.createCriteria().andGoodsnameEqualTo(GoodsName);
		return goodsMapper.selectByExample(goodsem);
	}
	
	//点击
	public Goods queryGooSelect3(Integer goodsid) {
		GoodsExample goodsem=new GoodsExample();
		goodsem.createCriteria().andGoodsidEqualTo(goodsid);
		return goodsMapper.selectByPrimaryKey(goodsid);
	}
	
	//删除
	public int queryGooDelete1(Integer Goodsid) {
		return goodsMapper.deleteByPrimaryKey(Goodsid);
	}
	
	//增加
	public int queryGooInsert1(Goods goods) {
		return goodsMapper.insert(goods);
	}
	
	//修改
	public int queryGooUpdate1(Goods goods) {
		return goodsMapper.updateByPrimaryKey(goods);
	}
	
}
