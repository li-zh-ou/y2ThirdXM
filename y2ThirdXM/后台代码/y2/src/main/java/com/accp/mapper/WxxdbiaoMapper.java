package com.accp.mapper;

import com.accp.domain.Wxxdbiao;
import com.accp.domain.WxxdbiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxxdbiaoMapper {
    int countByExample(WxxdbiaoExample example);

    int deleteByExample(WxxdbiaoExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Wxxdbiao record);

    int insertSelective(Wxxdbiao record);

    List<Wxxdbiao> selectByExample(WxxdbiaoExample example);

    Wxxdbiao selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Wxxdbiao record, @Param("example") WxxdbiaoExample example);

    int updateByExample(@Param("record") Wxxdbiao record, @Param("example") WxxdbiaoExample example);

    int updateByPrimaryKeySelective(Wxxdbiao record);

    int updateByPrimaryKey(Wxxdbiao record);
}