package com.accp.mapper;

import com.accp.domain.Yuangong;
import com.accp.domain.YuangongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YuangongMapper {
	List<Yuangong> queryygsrht();
	
	List<Yuangong> queryygsr();
	
	int lzdjhg(String yuanno);// 离职登记回滚

	Yuangong lzdjdk(String yuanno);// 离职登记打开

	List<Yuangong> querycssj();// 离职登记获取初始数据

	List<Yuangong> gjbmcxyg(Integer bumenid);// 组织机构点击树状图获取部门在根据部门id查询员工详情

	List<Yuangong> cxtxmlxq();// 通讯名录详情

	int xglzzt(String yuanno);// 组织机构赋删除员工

	int fujs(String zhiwuid, String yuanno);// 组织机构赋予员工角色

	Yuangong byupygff(String yuanno);// 组织机构修改员工查询

	int zkmm(String yuanno);// 组织机构置空密码

	List<Yuangong> ygcx();// 组织机构员工详情查询

	int countByExample(YuangongExample example);

	int deleteByExample(YuangongExample example);

	int deleteByPrimaryKey(String yuanno);

	int insert(Yuangong record);

	int insertSelective(Yuangong record);

	List<Yuangong> selectByExample(YuangongExample example);

	Yuangong selectByPrimaryKey(String yuanno);

	int updateByExampleSelective(@Param("record") Yuangong record, @Param("example") YuangongExample example);

	int updateByExample(@Param("record") Yuangong record, @Param("example") YuangongExample example);

	int updateByPrimaryKeySelective(Yuangong record);

	int updateByPrimaryKey(Yuangong record);
}