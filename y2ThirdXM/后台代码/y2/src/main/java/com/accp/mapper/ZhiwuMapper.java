package com.accp.mapper;

import com.accp.domain.Zhiwu;
import com.accp.domain.ZhiwuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhiwuMapper {
    int countByExample(ZhiwuExample example);

    int deleteByExample(ZhiwuExample example);

    int deleteByPrimaryKey(String zhiwuid);

    int insert(Zhiwu record);

    int insertSelective(Zhiwu record);

    List<Zhiwu> selectByExample(ZhiwuExample example);

    Zhiwu selectByPrimaryKey(String zhiwuid);

    int updateByExampleSelective(@Param("record") Zhiwu record, @Param("example") ZhiwuExample example);

    int updateByExample(@Param("record") Zhiwu record, @Param("example") ZhiwuExample example);

    int updateByPrimaryKeySelective(Zhiwu record);

    int updateByPrimaryKey(Zhiwu record);
}