package com.accp.mapper;

import com.accp.domain.Lingliao;
import com.accp.domain.LingliaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LingliaoMapper {
    int countByExample(LingliaoExample example);

    int deleteByExample(LingliaoExample example);

    int deleteByPrimaryKey(Integer llid);

    int insert(Lingliao record);

    int insertSelective(Lingliao record);

    List<Lingliao> selectByExample(LingliaoExample example);

    Lingliao selectByPrimaryKey(Integer llid);

    int updateByExampleSelective(@Param("record") Lingliao record, @Param("example") LingliaoExample example);

    int updateByExample(@Param("record") Lingliao record, @Param("example") LingliaoExample example);

    int updateByPrimaryKeySelective(Lingliao record);

    int updateByPrimaryKey(Lingliao record);
}