package com.accp.mapper;

import com.accp.domain.Waiqingcar;
import com.accp.domain.WaiqingcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaiqingcarMapper {
	
	int upwqcl(String chepai, String carbank, String chexing, String nowli, Integer banid, String ids);// 修改外勤车辆
	
    int countByExample(WaiqingcarExample example);

    int deleteByExample(WaiqingcarExample example);

    int deleteByPrimaryKey(String chepai);

    int insert(Waiqingcar record);

    int insertSelective(Waiqingcar record);

    List<Waiqingcar> selectByExample(WaiqingcarExample example);

    Waiqingcar selectByPrimaryKey(String chepai);

    int updateByExampleSelective(@Param("record") Waiqingcar record, @Param("example") WaiqingcarExample example);

    int updateByExample(@Param("record") Waiqingcar record, @Param("example") WaiqingcarExample example);

    int updateByPrimaryKeySelective(Waiqingcar record);

    int updateByPrimaryKey(Waiqingcar record);
}