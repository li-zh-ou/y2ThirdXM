package com.accp.mapper;

import com.accp.domain.Wxjiedan;
import com.accp.domain.WxjiedanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxjiedanMapper {
    int countByExample(WxjiedanExample example);

    int deleteByExample(WxjiedanExample example);

    int deleteByPrimaryKey(String wxdanno);

    int insert(Wxjiedan record);

    int insertSelective(Wxjiedan record);

    List<Wxjiedan> selectByExample(WxjiedanExample example);

    Wxjiedan selectByPrimaryKey(String wxdanno);

    int updateByExampleSelective(@Param("record") Wxjiedan record, @Param("example") WxjiedanExample example);

    int updateByExample(@Param("record") Wxjiedan record, @Param("example") WxjiedanExample example);

    int updateByPrimaryKeySelective(Wxjiedan record);

    int updateByPrimaryKey(Wxjiedan record);
}