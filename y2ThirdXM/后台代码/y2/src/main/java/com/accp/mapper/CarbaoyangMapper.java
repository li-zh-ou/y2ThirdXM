package com.accp.mapper;

import com.accp.domain.Carbaoyang;
import com.accp.domain.CarbaoyangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarbaoyangMapper {
    int countByExample(CarbaoyangExample example);

    int deleteByExample(CarbaoyangExample example);

    int insert(Carbaoyang record);

    int insertSelective(Carbaoyang record);

    List<Carbaoyang> selectByExample(CarbaoyangExample example);

    int updateByExampleSelective(@Param("record") Carbaoyang record, @Param("example") CarbaoyangExample example);

    int updateByExample(@Param("record") Carbaoyang record, @Param("example") CarbaoyangExample example);
}