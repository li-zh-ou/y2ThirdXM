package com.accp.mapper;

import com.accp.domain.Pinzhi;
import com.accp.domain.PinzhiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PinzhiMapper {
    int countByExample(PinzhiExample example);

    int deleteByExample(PinzhiExample example);

    int insert(Pinzhi record);

    int insertSelective(Pinzhi record);

    List<Pinzhi> selectByExample(PinzhiExample example);

    int updateByExampleSelective(@Param("record") Pinzhi record, @Param("example") PinzhiExample example);

    int updateByExample(@Param("record") Pinzhi record, @Param("example") PinzhiExample example);
}