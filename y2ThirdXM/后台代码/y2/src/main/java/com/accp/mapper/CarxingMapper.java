package com.accp.mapper;

import com.accp.domain.Carxing;
import com.accp.domain.CarxingExample;
import com.accp.domain.Model_three_table_check1;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarxingMapper {
	List<Carxing> querycarxing(@Param("carbankid") int carbankid, @Param("JinKou") String JinKou);
	
	List<Model_three_table_check1> modelchexbSelect1(@Param("CarBankId_1") Integer CarBankId_1);
	
    int countByExample(CarxingExample example);

    int deleteByExample(CarxingExample example);

    int deleteByPrimaryKey(Integer xingid);

    int insert(Carxing record);

    int insertSelective(Carxing record);

    List<Carxing> selectByExample(CarxingExample example);

    Carxing selectByPrimaryKey(Integer xingid);

    int updateByExampleSelective(@Param("record") Carxing record, @Param("example") CarxingExample example);

    int updateByExample(@Param("record") Carxing record, @Param("example") CarxingExample example);

    int updateByPrimaryKeySelective(Carxing record);

    int updateByPrimaryKey(Carxing record);
}