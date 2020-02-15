package com.accp.mapper;

import com.accp.domain.Kehutype;
import com.accp.domain.KehutypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehutypeMapper {
    int countByExample(KehutypeExample example);

    int deleteByExample(KehutypeExample example);

    int deleteByPrimaryKey(Integer typeid);

    int insert(Kehutype record);

    int insertSelective(Kehutype record);

    List<Kehutype> selectByExample(KehutypeExample example);

    Kehutype selectByPrimaryKey(Integer typeid);

    int updateByExampleSelective(@Param("record") Kehutype record, @Param("example") KehutypeExample example);

    int updateByExample(@Param("record") Kehutype record, @Param("example") KehutypeExample example);

    int updateByPrimaryKeySelective(Kehutype record);

    int updateByPrimaryKey(Kehutype record);
}