package com.accp.mapper;

import com.accp.domain.Huifang;
import com.accp.domain.HuifangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuifangMapper {
    int countByExample(HuifangExample example);

    int deleteByExample(HuifangExample example);

    int deleteByPrimaryKey(Integer huifangid);

    int insert(Huifang record);

    int insertSelective(Huifang record);

    List<Huifang> selectByExample(HuifangExample example);

    Huifang selectByPrimaryKey(Integer huifangid);

    int updateByExampleSelective(@Param("record") Huifang record, @Param("example") HuifangExample example);

    int updateByExample(@Param("record") Huifang record, @Param("example") HuifangExample example);

    int updateByPrimaryKeySelective(Huifang record);

    int updateByPrimaryKey(Huifang record);
}