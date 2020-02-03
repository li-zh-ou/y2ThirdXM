package com.accp.mapper;

import com.accp.domain.Fadongbrand;
import com.accp.domain.FadongbrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FadongbrandMapper {
    int countByExample(FadongbrandExample example);

    int deleteByExample(FadongbrandExample example);

    int deleteByPrimaryKey(Integer fabankid);

    int insert(Fadongbrand record);

    int insertSelective(Fadongbrand record);

    List<Fadongbrand> selectByExample(FadongbrandExample example);

    Fadongbrand selectByPrimaryKey(Integer fabankid);

    int updateByExampleSelective(@Param("record") Fadongbrand record, @Param("example") FadongbrandExample example);

    int updateByExample(@Param("record") Fadongbrand record, @Param("example") FadongbrandExample example);

    int updateByPrimaryKeySelective(Fadongbrand record);

    int updateByPrimaryKey(Fadongbrand record);
}