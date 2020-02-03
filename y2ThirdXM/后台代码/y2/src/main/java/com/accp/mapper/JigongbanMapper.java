package com.accp.mapper;

import com.accp.domain.Jigongban;
import com.accp.domain.JigongbanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JigongbanMapper {
    int countByExample(JigongbanExample example);

    int deleteByExample(JigongbanExample example);

    int deleteByPrimaryKey(Integer banid);

    int insert(Jigongban record);

    int insertSelective(Jigongban record);

    List<Jigongban> selectByExample(JigongbanExample example);

    Jigongban selectByPrimaryKey(Integer banid);

    int updateByExampleSelective(@Param("record") Jigongban record, @Param("example") JigongbanExample example);

    int updateByExample(@Param("record") Jigongban record, @Param("example") JigongbanExample example);

    int updateByPrimaryKeySelective(Jigongban record);

    int updateByPrimaryKey(Jigongban record);
}