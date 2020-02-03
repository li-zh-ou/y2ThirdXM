package com.accp.mapper;

import com.accp.domain.Ruzhi;
import com.accp.domain.RuzhiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuzhiMapper {
    int countByExample(RuzhiExample example);

    int deleteByExample(RuzhiExample example);

    int insert(Ruzhi record);

    int insertSelective(Ruzhi record);

    List<Ruzhi> selectByExample(RuzhiExample example);

    int updateByExampleSelective(@Param("record") Ruzhi record, @Param("example") RuzhiExample example);

    int updateByExample(@Param("record") Ruzhi record, @Param("example") RuzhiExample example);
}