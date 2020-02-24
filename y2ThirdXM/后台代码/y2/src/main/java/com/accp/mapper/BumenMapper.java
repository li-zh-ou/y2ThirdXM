package com.accp.mapper;

import com.accp.domain.Bumen;
import com.accp.domain.BumenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BumenMapper {
	
	int xzbm(String bumenname, Integer parentid);// 组织机构新增部门
	
    int countByExample(BumenExample example);

    int deleteByExample(BumenExample example);

    int deleteByPrimaryKey(Integer bumenid);

    int insert(Bumen record);

    int insertSelective(Bumen record);

    List<Bumen> selectByExample(BumenExample example);

    Bumen selectByPrimaryKey(Integer bumenid);

    int updateByExampleSelective(@Param("record") Bumen record, @Param("example") BumenExample example);

    int updateByExample(@Param("record") Bumen record, @Param("example") BumenExample example);

    int updateByPrimaryKeySelective(Bumen record);

    int updateByPrimaryKey(Bumen record);
}