package com.accp.mapper;

import com.accp.domain.Wxxiangmu;
import com.accp.domain.WxxiangmuExample;
import com.accp.domain.wxxia_wxshou1;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxxiangmuMapper {
	
	wxxia_wxshou1 querywxxwxSelect2(@Param("XiangMuNo") String XiangMuNo);
	
	List<wxxia_wxshou1> querywxxwxSelect1(@Param("pname") String pname);
	
    int countByExample(WxxiangmuExample example);

    int deleteByExample(WxxiangmuExample example);

    int deleteByPrimaryKey(String xiangmuno);

    int insert(Wxxiangmu record);

    int insertSelective(Wxxiangmu record);

    List<Wxxiangmu> selectByExample(WxxiangmuExample example);

    Wxxiangmu selectByPrimaryKey(String xiangmuno);

    int updateByExampleSelective(@Param("record") Wxxiangmu record, @Param("example") WxxiangmuExample example);

    int updateByExample(@Param("record") Wxxiangmu record, @Param("example") WxxiangmuExample example);

    int updateByPrimaryKeySelective(Wxxiangmu record);

    int updateByPrimaryKey(Wxxiangmu record);
}