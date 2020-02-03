package com.accp.mapper;

import com.accp.domain.Huoshang;
import com.accp.domain.HuoshangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuoshangMapper {
    int countByExample(HuoshangExample example);

    int deleteByExample(HuoshangExample example);

    int deleteByPrimaryKey(String huoshangno);

    int insert(Huoshang record);

    int insertSelective(Huoshang record);

    List<Huoshang> selectByExample(HuoshangExample example);

    Huoshang selectByPrimaryKey(String huoshangno);

    int updateByExampleSelective(@Param("record") Huoshang record, @Param("example") HuoshangExample example);

    int updateByExample(@Param("record") Huoshang record, @Param("example") HuoshangExample example);

    int updateByPrimaryKeySelective(Huoshang record);

    int updateByPrimaryKey(Huoshang record);
}