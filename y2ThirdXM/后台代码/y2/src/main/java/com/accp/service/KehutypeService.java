package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Kehutype;
import com.accp.mapper.KehutypeMapper;

@Service
@Transactional
public class KehutypeService {
	@Autowired
	KehutypeMapper typemapper;
	
	public List<Kehutype> querytype(){
		return typemapper.selectByExample(null);
	}
	public int addtype(Kehutype type) {
		return typemapper.insert(type);
	}
	public int updatetype(Kehutype type) {
		return typemapper.updateByPrimaryKey(type);
	}
	public int deletetype(int typeid) {
		return typemapper.deleteByPrimaryKey(typeid);
	}
}
