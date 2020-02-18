package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Yuangong;
import com.accp.domain.YuangongExample;
import com.accp.mapper.YuangongMapper;

@Service
@Transactional
public class LoginService {
	@Autowired
	YuangongMapper ygmapper;
	public List<Yuangong> queryby(Yuangong yg) {
		YuangongExample example=new YuangongExample();
		example.createCriteria().andLoginEqualTo(yg.getLogin()).andBei4EqualTo(yg.getBei4());
		return ygmapper.selectByExample(example);
	}
}
