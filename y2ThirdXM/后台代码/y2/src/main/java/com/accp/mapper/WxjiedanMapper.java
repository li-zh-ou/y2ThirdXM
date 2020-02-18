package com.accp.mapper;

import com.accp.domain.Wxjiedan;
import com.accp.domain.WxjiedanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxjiedanMapper {
    int countByExample(WxjiedanExample example);

    int deleteByExample(WxjiedanExample example);

    int deleteByPrimaryKey(String wxdanno);

    int insert(Wxjiedan record);

    int insertSelective(Wxjiedan record);

    List<Wxjiedan> selectByExample(WxjiedanExample example);

    Wxjiedan selectByPrimaryKey(String wxdanno);

    int updateByExampleSelective(@Param("record") Wxjiedan record, @Param("example") WxjiedanExample example);

    int updateByExample(@Param("record") Wxjiedan record, @Param("example") WxjiedanExample example);

    int updateByPrimaryKeySelective(Wxjiedan record);

    int updateByPrimaryKey(Wxjiedan record);
    
    List<Wxjiedan> queryJunGong(@Param("wxdanno") String wxdanno,@Param("chepai") String chepai,@Param("danjustatu") String danjustatu,@Param("pretime") String pretime,@Param("nexttime") String nexttime);
    
    List<Wxjiedan> queryWxlishi(String chepai);
    
    Wxjiedan queryWXKehuInfo(String wxchepai);
    
    String getTodayMaxCount(@Param("today") String today);
    
    Wxjiedan oldwxJieDan(String wxdanno);
    
    Wxjiedan newwxJieDan(String chepai);
    
    int insertwxdan(Wxjiedan record);
    
    List<Wxjiedan> queryZuoYeZhong();
}