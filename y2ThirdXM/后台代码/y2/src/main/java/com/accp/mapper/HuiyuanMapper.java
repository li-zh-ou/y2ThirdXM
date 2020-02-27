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
    
    List<Huiyuan> queryhuiyuan();
    
    //李周要添加
    
    int chongZhi(Huiyuan record);
    
    int yanQi(@Param("money") int money,@Param("no") String huiYuanNo);
    
    int insertHuiYuan(Huiyuan record);
    
    List<Huiyuan> queryAllHuiYuan(@Param("hy") String hy,@Param("phone") String phone,@Param("order") String order);
    
    Integer getTodayMaxCount(String today);
    
    Huiyuan xiaopiao(String chepai);
    
    int shenjihuangji();
    
    int shenjizuanshi();
    
	Huiyuan jiesuanQuery(String wxdanno);
	
	int jiesuanyzTime(String huiyuanno);

	int jiesuanyzMoney(@Param("huiyuanno") String huiyuanno,@Param("money") String money);

	int jiesuanUpdate(@Param("huiyuanno") String huiyuanno,@Param("money") Double money);
}