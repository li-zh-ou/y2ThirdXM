package com.accp.mapper;

import com.accp.domain.Lizhi;
import com.accp.domain.LizhiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LizhiMapper {
    int countByExample(LizhiExample example);

    int deleteByExample(LizhiExample example);

    int insert(Lizhi record);

    int insertSelective(Lizhi record);

    List<Lizhi> selectByExample(LizhiExample example);

    int updateByExampleSelective(@Param("record") Lizhi record, @Param("example") LizhiExample example);

    int updateByExample(@Param("record") Lizhi record, @Param("example") LizhiExample example);
}