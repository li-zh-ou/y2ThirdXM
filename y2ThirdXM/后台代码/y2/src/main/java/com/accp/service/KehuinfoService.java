package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Kehu;
import com.accp.domain.KehuExample;
import com.accp.domain.Kehucar;
import com.accp.domain.KehucarExample;
import com.accp.mapper.KehuMapper;
import com.accp.mapper.KehucarMapper;

@Service
@Transactional
public class KehuinfoService {
	
	@Autowired
	KehuMapper kehumapper;
	@Autowired
	KehucarMapper carmapper;
	
	public List<Kehu> QueryKehu(){
		return kehumapper.findkehu();
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
}
