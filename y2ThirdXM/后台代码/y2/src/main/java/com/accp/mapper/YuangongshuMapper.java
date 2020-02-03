package com.accp.mapper;

import com.accp.domain.Yuangongshu;
import com.accp.domain.YuangongshuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YuangongshuMapper {
    int countByExample(YuangongshuExample example);

    int deleteByExample(YuangongshuExample example);

    int deleteByPrimaryKey(Integer shuxingid);

    int insert(Yuangongshu record);

    int insertSelective(Yuangongshu record);

    List<Yuangongshu> selectByExample(YuangongshuExample example);

    Yuangongshu selectByPrimaryKey(Integer shuxingid);

    int updateByExampleSelective(@Param("record") Yuangongshu record, @Param("example") YuangongshuExample example);

    int updateByExample(@Param("record") Yuangongshu record, @Param("example") YuangongshuExample example);

    int updateByPrimaryKeySelective(Yuangongshu record);

    int updateByPrimaryKey(Yuangongshu record);
}