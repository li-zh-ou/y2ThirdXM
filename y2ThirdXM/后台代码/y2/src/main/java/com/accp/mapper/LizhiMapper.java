package com.accp.mapper;

import com.accp.domain.Lizhi;
import com.accp.domain.LizhiExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LizhiMapper {
	
	int lzxqinsert(String yuanno,Date lizhitime,String remark);//离职登记新增离职详情
	
	int delete(String yuanno);//离职登记回滚删除离职详情
	
    int countByExample(LizhiExample example);

    int deleteByExample(LizhiExample example);

    int insert(Lizhi record);

    int insertSelective(Lizhi record);

    List<Lizhi> selectByExample(LizhiExample example);

    int updateByExampleSelective(@Param("record") Lizhi record, @Param("example") LizhiExample example);

    int updateByExample(@Param("record") Lizhi record, @Param("example") LizhiExample example);
}