package com.accp.mapper;

import com.accp.domain.Gangwei;
import com.accp.domain.GangweiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GangweiMapper {
	//岗位定义修改岗位
	int update(Integer gangweiid,String gangweiname,Integer ids);
	
    int countByExample(GangweiExample example);

    int deleteByExample(GangweiExample example);

    int deleteByPrimaryKey(Integer gangweiid);

    int insert(Gangwei record);

    int insertSelective(Gangwei record);

    List<Gangwei> selectByExample(GangweiExample example);

    Gangwei selectByPrimaryKey(Integer gangweiid);

    int updateByExampleSelective(@Param("record") Gangwei record, @Param("example") GangweiExample example);

    int updateByExample(@Param("record") Gangwei record, @Param("example") GangweiExample example);

    int updateByPrimaryKeySelective(Gangwei record);

    int updateByPrimaryKey(Gangwei record);
}