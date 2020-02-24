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
    
    //李周要添加
    List<Wxjiedan> queryJunGong(@Param("wxdanno") String wxdanno,@Param("chepai") String chepai,@Param("danjustatu") String danjustatu,@Param("pretime") String pretime,@Param("nexttime") String nexttime);
    
    List<Wxjiedan> queryWxlishi(String chepai);
    
    Wxjiedan queryWXKehuInfo(String wxchepai);
    
    String getTodayMaxCount(@Param("today") String today);
    
    Wxjiedan oldwxJieDan(String wxdanno);
    
    Wxjiedan newwxJieDan(String chepai);
    
    Integer insertwxdan(Wxjiedan record);
    
    List<Wxjiedan> queryZuoYeZhong();
    
    List<Wxjiedan> queryJieSuan(@Param("wxdanno") String wxdanno,@Param("starttime")String starttime,@Param("endtime")String endtime,@Param("jiesuanstatu")String jiesuanstatu,@Param("danjustatu")String danjustatu,@Param("chepai")String chepai,@Param("kehuname")String kehuname,@Param("guwen")String guwen,@Param("yewutype")String yewutype,@Param("remark")String remark);
    
    int queryByPrimaryKeyCount(String wxdanno);
}