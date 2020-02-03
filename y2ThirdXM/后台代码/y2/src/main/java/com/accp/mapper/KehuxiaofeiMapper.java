package com.accp.mapper;

import com.accp.domain.Kehuxiaofei;
import com.accp.domain.KehuxiaofeiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehuxiaofeiMapper {
    int countByExample(KehuxiaofeiExample example);

    int deleteByExample(KehuxiaofeiExample example);

    int deleteByPrimaryKey(Integer xiaoid);

    int insert(Kehuxiaofei record);

    int insertSelective(Kehuxiaofei record);

    List<Kehuxiaofei> selectByExample(KehuxiaofeiExample example);

    Kehuxiaofei selectByPrimaryKey(Integer xiaoid);

    int updateByExampleSelective(@Param("record") Kehuxiaofei record, @Param("example") KehuxiaofeiExample example);

    int updateByExample(@Param("record") Kehuxiaofei record, @Param("example") KehuxiaofeiExample example);

    int updateByPrimaryKeySelective(Kehuxiaofei record);

    int updateByPrimaryKey(Kehuxiaofei record);
}