package com.accp.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Yuangong {
	private String yuanno;// 员工编号

	private Integer shuxingid;// 属性id

	private Integer bumenid;// 所属部门id

	private String yuanname;// 员工姓名

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date birthday;// 出生日期

	private String sex;// 性别

	private String phone;// 联系电话

	private String empeople;// 紧急联系人

	private String emphone;// 紧急联系人电话

	private String zhiwuid;// 职务id

	private String nowaddress;// 现住地址

	private String huaddress;// 户口地址

	private String bank;// 开户银行

	private String cardnumber;// 银行帐号

	private String email;// 邮箱

	private String bodystate;// 身体状况

	private Integer height;// 身高

	private String jiguan;// 籍贯

	private String minzu;// 民族

	private String hunyin;// 婚姻状况

	private String xueli;// 学历

	private String biye;// 毕业学校

	private String zhuanye;// 专业

	private String zhuanyezg;// 专业资格

	private String xuewei;// 学位

	private String bianzhi;// 编制

	private String idcard;// 身份证号码

	private String shouji;// 手机
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date shiyong;// 试用到期
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date hetongstart;// 合同开始日期
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date hetongend;// 合同结束日期

	private String kazi;// 卡自编号

	private String kanei;// 卡内部号

	private String tuijian;// 推荐人

	private Double zdzhekou;// 整单折扣权

	private Double gszhekou;// 工时折扣权

	private Double spzhekou;// 商品折扣权

	private Double jianmian;// 减免权

	private String fenqi;// 分期短号

	private Integer sflz;// 是否离职1表示已经离职0表示没有离职

	private Integer gangweid;// 岗位id

	private String login;// 登陆账号

	private String bei1;// 户口邮编

	private String bei2;// 现住邮编
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date bei3;// 入职日期

	private String bei4;

	private String bumenname;// 部门名称

	private String gangweiname;// 岗位名称
	
	private String zhiwuname;//角色名称
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date lizhitime;//离职时间
	
	private String remark;//离职说明
	
	public String getZhiwuname() {
		return zhiwuname;
	}

	public void setZhiwuname(String zhiwuname) {
		this.zhiwuname = zhiwuname;
	}

	public Date getLizhitime() {
		return lizhitime;
	}

	public void setLizhitime(Date lizhitime) {
		this.lizhitime = lizhitime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBumenname() {
		return bumenname;
	}

	public void setBumenname(String bumenname) {
		this.bumenname = bumenname;
	}

	public String getGangweiname() {
		return gangweiname;
	}

	public void setGangweiname(String gangweiname) {
		this.gangweiname = gangweiname;
	}

	public String getYuanno() {
		return yuanno;
	}

	public void setYuanno(String yuanno) {
		this.yuanno = yuanno;
	}

	public Integer getShuxingid() {
		return shuxingid;
	}

	public void setShuxingid(Integer shuxingid) {
		this.shuxingid = shuxingid;
	}

	public Integer getBumenid() {
		return bumenid;
	}

	public void setBumenid(Integer bumenid) {
		this.bumenid = bumenid;
	}

	public String getYuanname() {
		return yuanname;
	}

	public void setYuanname(String yuanname) {
		this.yuanname = yuanname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmpeople() {
		return empeople;
	}

	public void setEmpeople(String empeople) {
		this.empeople = empeople;
	}

	public String getEmphone() {
		return emphone;
	}

	public void setEmphone(String emphone) {
		this.emphone = emphone;
	}

	public String getZhiwuid() {
		return zhiwuid;
	}

	public void setZhiwuid(String zhiwuid) {
		this.zhiwuid = zhiwuid;
	}

	public String getNowaddress() {
		return nowaddress;
	}

	public void setNowaddress(String nowaddress) {
		this.nowaddress = nowaddress;
	}

	public String getHuaddress() {
		return huaddress;
	}

	public void setHuaddress(String huaddress) {
		this.huaddress = huaddress;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBodystate() {
		return bodystate;
	}

	public void setBodystate(String bodystate) {
		this.bodystate = bodystate;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getJiguan() {
		return jiguan;
	}

	public void setJiguan(String jiguan) {
		this.jiguan = jiguan;
	}

	public String getMinzu() {
		return minzu;
	}

	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}

	public String getHunyin() {
		return hunyin;
	}

	public void setHunyin(String hunyin) {
		this.hunyin = hunyin;
	}

	public String getXueli() {
		return xueli;
	}

	public void setXueli(String xueli) {
		this.xueli = xueli;
	}

	public String getBiye() {
		return biye;
	}

	public void setBiye(String biye) {
		this.biye = biye;
	}

	public String getZhuanye() {
		return zhuanye;
	}

	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}

	public String getZhuanyezg() {
		return zhuanyezg;
	}

	public void setZhuanyezg(String zhuanyezg) {
		this.zhuanyezg = zhuanyezg;
	}

	public String getXuewei() {
		return xuewei;
	}

	public void setXuewei(String xuewei) {
		this.xuewei = xuewei;
	}

	public String getBianzhi() {
		return bianzhi;
	}

	public void setBianzhi(String bianzhi) {
		this.bianzhi = bianzhi;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getShouji() {
		return shouji;
	}

	public void setShouji(String shouji) {
		this.shouji = shouji;
	}

	public Date getShiyong() {
		return shiyong;
	}

	public void setShiyong(Date shiyong) {
		this.shiyong = shiyong;
	}

	public Date getHetongstart() {
		return hetongstart;
	}

	public void setHetongstart(Date hetongstart) {
		this.hetongstart = hetongstart;
	}

	public Date getHetongend() {
		return hetongend;
	}

	public void setHetongend(Date hetongend) {
		this.hetongend = hetongend;
	}

	public String getKazi() {
		return kazi;
	}

	public void setKazi(String kazi) {
		this.kazi = kazi;
	}

	public String getKanei() {
		return kanei;
	}

	public void setKanei(String kanei) {
		this.kanei = kanei;
	}

	public String getTuijian() {
		return tuijian;
	}

	public void setTuijian(String tuijian) {
		this.tuijian = tuijian;
	}

	public Double getZdzhekou() {
		return zdzhekou;
	}

	public void setZdzhekou(Double zdzhekou) {
		this.zdzhekou = zdzhekou;
	}

	public Double getGszhekou() {
		return gszhekou;
	}

	public void setGszhekou(Double gszhekou) {
		this.gszhekou = gszhekou;
	}

	public Double getSpzhekou() {
		return spzhekou;
	}

	public void setSpzhekou(Double spzhekou) {
		this.spzhekou = spzhekou;
	}

	public Double getJianmian() {
		return jianmian;
	}

	public void setJianmian(Double jianmian) {
		this.jianmian = jianmian;
	}

	public String getFenqi() {
		return fenqi;
	}

	public void setFenqi(String fenqi) {
		this.fenqi = fenqi;
	}

	public Integer getSflz() {
		return sflz;
	}

	public void setSflz(Integer sflz) {
		this.sflz = sflz;
	}

	public Integer getGangweid() {
		return gangweid;
	}

	public void setGangweid(Integer gangweid) {
		this.gangweid = gangweid;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getBei1() {
		return bei1;
	}

	public void setBei1(String bei1) {
		this.bei1 = bei1;
	}

	public String getBei2() {
		return bei2;
	}

	public void setBei2(String bei2) {
		this.bei2 = bei2;
	}

	public Date getBei3() {
		return bei3;
	}

	public void setBei3(Date bei3) {
		this.bei3 = bei3;
	}

	public String getBei4() {
		return bei4;
	}

	public void setBei4(String bei4) {
		this.bei4 = bei4;
	}
}