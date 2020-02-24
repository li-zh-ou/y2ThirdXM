package com.accp.mapper;

import com.accp.domain.Jungong;
import com.accp.domain.JungongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JungongMapper {
    int countByExample(JungongExample example);

    int deleteByExample(JungongExample example);

    int insert(Jungong record);

    int insertSelective(Jungong record);

    List<Jungong> selectByExample(JungongExample example);

    int updateByExampleSelective(@Param("record") Jungong record, @Param("example") JungongExample example);

    int updateByExample(@Param("record") Jungong record, @Param("example") JungongExample example);

    //李周
    
    Integer queryCiShu(String wxdanno);
    
    Integer insertJunGong(Jungong record);
    
    Integer updatestatu(@Param("shijitime") String shijitime,@Param("wxdanno") String wxdanno);
}