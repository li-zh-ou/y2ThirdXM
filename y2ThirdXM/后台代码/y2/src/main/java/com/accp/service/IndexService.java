package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Yuangong;
import com.accp.domain.Zhiwu;
import com.accp.mapper.YuangongMapper;
import com.accp.mapper.ZhiwuMapper;

@Service
@Transactional
public class IndexService {
	
	@Autowired
	ZhiwuMapper zhiwumapper;
	@Autowired
	YuangongMapper yuanmapper;
	public Yuangong query(String Yuanno){
		return yuanmapper.selectByPrimaryKey(Yuanno);
	}
}
