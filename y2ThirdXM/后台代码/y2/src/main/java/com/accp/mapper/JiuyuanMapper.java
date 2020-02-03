package com.accp.mapper;

import com.accp.domain.Jiuyuan;
import com.accp.domain.JiuyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiuyuanMapper {
    int countByExample(JiuyuanExample example);

    int deleteByExample(JiuyuanExample example);

    int insert(Jiuyuan record);

    int insertSelective(Jiuyuan record);

    List<Jiuyuan> selectByExample(JiuyuanExample example);

    int updateByExampleSelective(@Param("record") Jiuyuan record, @Param("example") JiuyuanExample example);

    int updateByExample(@Param("record") Jiuyuan record, @Param("example") JiuyuanExample example);
}