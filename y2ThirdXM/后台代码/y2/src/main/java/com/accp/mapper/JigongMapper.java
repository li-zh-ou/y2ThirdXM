package com.accp.mapper;

import com.accp.domain.Jigong;
import com.accp.domain.JigongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JigongMapper {
    int countByExample(JigongExample example);

    int deleteByExample(JigongExample example);

    int deleteByPrimaryKey(String jigongno);

    int insert(Jigong record);

    int insertSelective(Jigong record);

    List<Jigong> selectByExample(JigongExample example);

    Jigong selectByPrimaryKey(String jigongno);

    int updateByExampleSelective(@Param("record") Jigong record, @Param("example") JigongExample example);

    int updateByExample(@Param("record") Jigong record, @Param("example") JigongExample example);

    int updateByPrimaryKeySelective(Jigong record);

    int updateByPrimaryKey(Jigong record);
}