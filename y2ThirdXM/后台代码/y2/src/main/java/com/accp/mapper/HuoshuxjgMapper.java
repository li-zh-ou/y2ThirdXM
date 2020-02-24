package com.accp.mapper;

import com.accp.domain.Huoshuxjg;
import com.accp.domain.HuoshuxjgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuoshuxjgMapper {
    int countByExample(HuoshuxjgExample example);

    int deleteByExample(HuoshuxjgExample example);

    int deleteByPrimaryKey(Integer hid);

    int insert(Huoshuxjg record);

    int insertSelective(Huoshuxjg record);

    List<Huoshuxjg> selectByExample(HuoshuxjgExample example);

    Huoshuxjg selectByPrimaryKey(Integer hid);

    int updateByExampleSelective(@Param("record") Huoshuxjg record, @Param("example") HuoshuxjgExample example);

    int updateByExample(@Param("record") Huoshuxjg record, @Param("example") HuoshuxjgExample example);

    int updateByPrimaryKeySelective(Huoshuxjg record);

    int updateByPrimaryKey(Huoshuxjg record);
}