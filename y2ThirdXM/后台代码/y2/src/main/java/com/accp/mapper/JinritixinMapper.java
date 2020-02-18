package com.accp.mapper;

import com.accp.domain.Jinritixin;
import com.accp.domain.JinritixinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JinritixinMapper {
    int countByExample(JinritixinExample example);

    int deleteByExample(JinritixinExample example);

    int insert(Jinritixin record);

    int insertSelective(Jinritixin record);

    List<Jinritixin> selectByExample(JinritixinExample example);

    int updateByExampleSelective(@Param("record") Jinritixin record, @Param("example") JinritixinExample example);

    int updateByExample(@Param("record") Jinritixin record, @Param("example") JinritixinExample example);
}