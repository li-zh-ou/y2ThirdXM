package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Bumen;
import com.accp.mapper.BumenMapper;

@Service
@Transactional
public class NcqzzjgdyService {
	
	@Autowired
	BumenMapper bumenMapper;
	
	/*
	 * public Bumen querybm() { return bumenMapper.selectByPrimaryKey(null); }
	 */
	
	
}
