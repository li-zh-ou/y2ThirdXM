package com.accp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Huiyuan;
import com.accp.domain.Jinritixin;
import com.accp.domain.JinritixinExample;
import com.accp.domain.Kehu;
import com.accp.domain.KehuExample;
import com.accp.domain.Kehucar;
import com.accp.domain.KehucarExample;
import com.accp.domain.Wxjiedan;
import com.accp.domain.WxjiedanExample;
import com.accp.domain.Yuangong;
import com.accp.mapper.HuiyuanMapper;
import com.accp.mapper.JinritixinMapper;
import com.accp.mapper.KehuMapper;
import com.accp.mapper.KehucarMapper;
import com.accp.mapper.WxjiedanMapper;
import com.accp.mapper.YuangongMapper;
import com.fasterxml.jackson.annotation.JsonFormat;

@Service
@Transactional
public class KehuinfoService {
	
	@Autowired
	KehuMapper kehumapper;
	@Autowired
	KehucarMapper carmapper;
	@Autowired
	HuiyuanMapper huiyuanmapper;
	@Autowired
	YuangongMapper yuangongmapper;
	@Autowired
	WxjiedanMapper wxmapper;
	@Autowired
	JinritixinMapper jinmapper;
	public List<Wxjiedan> queryjieche(String chepai) {
		WxjiedanExample example=new WxjiedanExample();
		example.createCriteria().andChepaiEqualTo(chepai);
		return wxmapper.selectByExample(example);
	}
	public List<Wxjiedan> queryjiechekehu(String kehuno) {
		WxjiedanExample example=new WxjiedanExample();
		example.createCriteria().andKehunnoEqualTo(kehuno);
		return wxmapper.selectByExample(example);
	}
	public List<Kehu> QueryKehu(){
		return kehumapper.findkehu();
	}
	public List<Kehucar> querykehucar(){
		return carmapper.findqbukehucar();
	}
	public List<Kehu> querykehubydata(){
		return kehumapper.findshengr();
	}
	public List<Huiyuan> queryhuiyuan(){
		return huiyuanmapper.queryhuiyuan();
	}
	public List<Kehucar> queryjiazhao(){
		return carmapper.queryjiazhao();
	}
	public List<Kehucar> querybaoxian(){
		return carmapper.querybaoxian();
	}
	public List<Kehu> queryliushi(){
		return kehumapper.queryliushi();
	}
	public List<Kehucar> querysijir(){
		return carmapper.querysijir();
	}
	public List<Yuangong> queryygsr(){
		return yuangongmapper.queryygsr();
	}
	public List<Yuangong> queryygsrht(){
		return yuangongmapper.queryygsrht();
	}
	
	
	
	
	public List<Kehu> querymokehu(String kehuno,String kehuphone){
		return kehumapper.querymokehu(kehuno, kehuphone);
	}
	public List<Kehu> querybykehub(String kehuno){
		return kehumapper.querybykehub(kehuno);
	}
	public List<Kehucar> querymokehucar(String chepai){
		return carmapper.querymokehucar(chepai);
	}
	public List<Kehucar> QueryBykehuno(String kehuno){
		return carmapper.findkehucar(kehuno);
	}
	
	public int AddKehu(Kehu kehu) {
		return kehumapper.insert(kehu);
	}
	
	public int UpdateKehu(Kehu kehu) {
		KehuExample example=new KehuExample();
		example.createCriteria().andKehunoEqualTo(kehu.getKehuno());
		kehumapper.deleteByExample(example);
		return kehumapper.insert(kehu);
	}
	
	public int DeleteKehu(String kehuno) {
		KehuExample example=new KehuExample();
		example.createCriteria().andKehunoEqualTo(kehuno);
		KehucarExample example2=new KehucarExample();
		example2.createCriteria().andKehunoEqualTo(kehuno);
		carmapper.deleteByExample(example2);
		return kehumapper.deleteByExample(example);
	}
	public List<Kehu> duotiaojianchakehu(Kehu kehu){
		List<Kehu> ke=kehumapper.querychatiao(kehu);
		return ke;
	}
	public List<Kehucar> duotiaojianchacar(Kehucar car){
		List<Kehucar> ca=carmapper.chacar(car);
		return ca;
	}
	
	public List<Jinritixin> queryByjindate(String ss){
		 List<Jinritixin> sss=jinmapper.queryjinrdate(ss);
		return jinmapper.queryjinrdate(ss);
	}
	public int addjin(String da) {
		Jinritixin jin=new Jinritixin();
		SimpleDateFormat d=new SimpleDateFormat("yyyy-MM-dd");
		Date s=null;
		try {
			s = d.parse(da);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jin.setDantianshijian(s);
		return jinmapper.insert(jin);
	}
}
