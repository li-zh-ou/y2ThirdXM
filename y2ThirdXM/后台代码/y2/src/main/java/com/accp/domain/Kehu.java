package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Kehu {
    private Integer kehuid;

    private String kehuno;

    private String kehuname;

    private String kehuaddress;

    private String zhuaddress;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date kehubirthday;

    private String kehutype;

    private String kehulianxi;

    private String kehuphone;

    private int zhangqi;

    private Double guazhang;

    private Double edu;

    private Double dinjin;

    private String guwen;

    private String guwenphone;

    private String chepai;

    private String remark;

    private Integer jifen;

    private String zhuphone;

    private String bank;

    private String bankcard;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date bei1;

    private String bei2;

    private String bei3;

    private String bei4;

    private String huiyuanno;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date ruhuitime;
    
    public String getHuiyuanno() {
		return huiyuanno;
	}

	public void setHuiyuanno(String huiyuanno) {
		this.huiyuanno = huiyuanno;
	}

	public Date getRuhuitime() {
		return ruhuitime;
	}

	public void setRuhuitime(Date ruhuitime) {
		this.ruhuitime = ruhuitime;
	}

	public Date getDaoqitime() {
		return daoqitime;
	}

	public void setDaoqitime(Date daoqitime) {
		this.daoqitime = daoqitime;
	}
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date daoqitime;

	public Integer getKehuid() {
        return kehuid;
    }

    public void setKehuid(Integer kehuid) {
        this.kehuid = kehuid;
    }

    public String getKehuno() {
        return kehuno;
    }

    public void setKehuno(String kehuno) {
        this.kehuno = kehuno;
    }

    public String getKehuname() {
        return kehuname;
    }

    public void setKehuname(String kehuname) {
        this.kehuname = kehuname;
    }

    public String getKehuaddress() {
        return kehuaddress;
    }

    public void setKehuaddress(String kehuaddress) {
        this.kehuaddress = kehuaddress;
    }

    public String getZhuaddress() {
        return zhuaddress;
    }

    public void setZhuaddress(String zhuaddress) {
        this.zhuaddress = zhuaddress;
    }

    public Date getKehubirthday() {
        return kehubirthday;
    }

    public void setKehubirthday(Date kehubirthday) {
        this.kehubirthday = kehubirthday;
    }

    public String getKehutype() {
        return kehutype;
    }

    public void setKehutype(String kehutype) {
        this.kehutype = kehutype;
    }

    public String getKehulianxi() {
        return kehulianxi;
    }

    public void setKehulianxi(String kehulianxi) {
        this.kehulianxi = kehulianxi;
    }

    public String getKehuphone() {
        return kehuphone;
    }

    public void setKehuphone(String kehuphone) {
        this.kehuphone = kehuphone;
    }

    public int getZhangqi() {
        return zhangqi;
    }

    public void setZhangqi(int zhangqi) {
        this.zhangqi = zhangqi;
    }

    public Double getGuazhang() {
        return guazhang;
    }

    public void setGuazhang(Double guazhang) {
        this.guazhang = guazhang;
    }

    public Double getEdu() {
        return edu;
    }

    public void setEdu(Double edu) {
        this.edu = edu;
    }

    public Double getDinjin() {
        return dinjin;
    }

    public void setDinjin(Double dinjin) {
        this.dinjin = dinjin;
    }

    public String getGuwen() {
        return guwen;
    }

    public void setGuwen(String guwen) {
        this.guwen = guwen;
    }

    public String getGuwenphone() {
        return guwenphone;
    }

    public void setGuwenphone(String guwenphone) {
        this.guwenphone = guwenphone;
    }

    public String getChepai() {
        return chepai;
    }

    public void setChepai(String chepai) {
        this.chepai = chepai;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    public String getZhuphone() {
        return zhuphone;
    }

    public void setZhuphone(String zhuphone) {
        this.zhuphone = zhuphone;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public Date getBei1() {
        return bei1;
    }

    public void setBei1(Date bei1) {
        this.bei1 = bei1;
    }

    public String getBei2() {
        return bei2;
    }

    public void setBei2(String bei2) {
        this.bei2 = bei2;
    }

    public String getBei3() {
        return bei3;
    }

    public void setBei3(String bei3) {
        this.bei3 = bei3;
    }

    public String getBei4() {
        return bei4;
    }

    public void setBei4(String bei4) {
        this.bei4 = bei4;
    }
}