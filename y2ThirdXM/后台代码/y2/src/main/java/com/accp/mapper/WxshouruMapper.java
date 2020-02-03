package com.accp.mapper;

import com.accp.domain.Wxshouru;
import com.accp.domain.WxshouruExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxshouruMapper {
    int countByExample(WxshouruExample example);

    int deleteByExample(WxshouruExample example);

    int deleteByPrimaryKey(Integer shouruid);

    int insert(Wxshouru record);

    int insertSelective(Wxshouru record);

    List<Wxshouru> selectByExample(WxshouruExample example);

    Wxshouru selectByPrimaryKey(Integer shouruid);

    int updateByExampleSelective(@Param("record") Wxshouru record, @Param("example") WxshouruExample example);

    int updateByExample(@Param("record") Wxshouru record, @Param("example") WxshouruExample example);

    int updateByPrimaryKeySelective(Wxshouru record);

    int updateByPrimaryKey(Wxshouru record);
}