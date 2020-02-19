package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Huiyuan;
import com.accp.domain.Kehu;
import com.accp.domain.KehuExample;
import com.accp.domain.Kehucar;
import com.accp.domain.KehucarExample;
import com.accp.domain.Yuangong;
import com.accp.mapper.HuiyuanMapper;
import com.accp.mapper.KehuMapper;
import com.accp.mapper.KehucarMapper;
import com.accp.mapper.YuangongMapper;

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
	
	public List<Kehu> QueryKehu(){
		return kehumapper.findkehu();
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
}
