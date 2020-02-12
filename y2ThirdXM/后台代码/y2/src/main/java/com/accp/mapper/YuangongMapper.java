package com.accp.mapper;

import com.accp.domain.Yuangong;
import com.accp.domain.YuangongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YuangongMapper {
	
	public Yuangong byupygff(String yuanno);//修改员工查询

	public int zkmm(String yuanno);// 组织机构置空密码

	List<Yuangong> ygcx();// 组织机构员工详情查询

	int countByExample(YuangongExample example);

	int deleteByExample(YuangongExample example);

	int deleteByPrimaryKey(String yuanno);

	int insert(Yuangong record);

	int insertSelective(Yuangong record);

	List<Yuangong> selectByExample(YuangongExample example);

	Yuangong selectByPrimaryKey(String yuanno);

	int updateByExampleSelective(@Param("record") Yuangong record, @Param("example") YuangongExample example);

	int updateByExample(@Param("record") Yuangong record, @Param("example") YuangongExample example);

	int updateByPrimaryKeySelective(Yuangong record);

	int updateByPrimaryKey(Yuangong record);
}