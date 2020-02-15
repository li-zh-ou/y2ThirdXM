package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Zhiwu;
import com.accp.mapper.ZhiwuMapper;

@Service
@Transactional
public class ZhiwuService {
	@Autowired
	ZhiwuMapper zhiwumapper;
	
	public List<Zhiwu> queryzhiwu(){
		return zhiwumapper.selectByExample(null);
	}
	public int addzhiwu(Zhiwu zhiwu) {
		return zhiwumapper.insert(zhiwu);
	}
	public int updatezhiwu(Zhiwu zhiwu) {
		return zhiwumapper.updateByPrimaryKey(zhiwu);
	}
}
