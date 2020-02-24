package com.accp.mapper;

import com.accp.domain.Jigongstar;
import com.accp.domain.JigongstarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JigongstarMapper {
	
	int upjgxj(Integer jistarid, String starname, String ticheng);// 技工星级修改
	
    int countByExample(JigongstarExample example);

    int deleteByExample(JigongstarExample example);

    int deleteByPrimaryKey(Integer jistarid);

    int insert(Jigongstar record);

    int insertSelective(Jigongstar record);

    List<Jigongstar> selectByExample(JigongstarExample example);

    Jigongstar selectByPrimaryKey(Integer jistarid);

    int updateByExampleSelective(@Param("record") Jigongstar record, @Param("example") JigongstarExample example);

    int updateByExample(@Param("record") Jigongstar record, @Param("example") JigongstarExample example);

    int updateByPrimaryKeySelective(Jigongstar record);

    int updateByPrimaryKey(Jigongstar record);
}