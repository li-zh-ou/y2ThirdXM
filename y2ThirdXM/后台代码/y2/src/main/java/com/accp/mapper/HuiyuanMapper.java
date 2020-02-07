package com.accp.mapper;

import com.accp.domain.Huiyuan;
import com.accp.domain.HuiyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HuiyuanMapper {
    int countByExample(HuiyuanExample example);

    int deleteByExample(HuiyuanExample example);

    int deleteByPrimaryKey(String huiyuanno);

    int insert(Huiyuan record);

    int insertSelective(Huiyuan record);

    List<Huiyuan> selectByExample(HuiyuanExample example);

    Huiyuan selectByPrimaryKey(String huiyuanno);

    int updateByExampleSelective(@Param("record") Huiyuan record, @Param("example") HuiyuanExample example);

    int updateByExample(@Param("record") Huiyuan record, @Param("example") HuiyuanExample example);

    int updateByPrimaryKeySelective(Huiyuan record);

    int updateByPrimaryKey(Huiyuan record);
    
    //李周添加
    int chongZhi(Huiyuan record);
    //李周添加
    int yanQi(@Param("money") int money,@Param("no") String huiYuanNo);
}