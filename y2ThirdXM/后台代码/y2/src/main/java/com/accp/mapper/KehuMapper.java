package com.accp.mapper;

import com.accp.domain.Kehu;
import com.accp.domain.KehuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KehuMapper {
	List<Kehu> queryliushi();
	
	List<Kehu> findshengr();
	
	List<Kehu> querychatiao(@Param("aaa")Kehu kehu);
	
	List<Kehu> querybykehub(String kehuno);
	
	List<Kehu> querymokehu(@Param("kehuno") String kehuno, @Param("kehuphone") String kehuphone);
	
	List<Kehu> findkehu();
	
    int countByExample(KehuExample example);

    int deleteByExample(KehuExample example);

    int deleteByPrimaryKey(Integer kehuid);

    int insert(Kehu record);

    int insertSelective(Kehu record);

    List<Kehu> selectByExample(KehuExample example);

    Kehu selectByPrimaryKey(Integer kehuid);

    int updateByExampleSelective(@Param("record") Kehu record, @Param("example") KehuExample example);

    int updateByExample(@Param("record") Kehu record, @Param("example") KehuExample example);

    int updateByPrimaryKeySelective(Kehu record);

    int updateByPrimaryKey(Kehu record);
    
    //李周添加
    List<Kehu> queryNoHuiYuan(@Param("where") String where);
    
}