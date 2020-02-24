package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Huiyuan {
    private String huiyuanno;

    private String kehuno;

    private String huiyuanname;

    private Double huiyuanmoney;

    private Double xiaofei;

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date ruhuitime;

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",timezone="GMT+8")
    private Date daoqitime;

    private String huiyuangraden;

    private String youhui;

    private Integer jifen;

    private String bei1;

    private String bei2;

    private String bei3;

    private String bei4;
    
    private Integer shichang;

    public Integer getShichang() {
		return shichang;
	}

	public void setShichang(Integer shichang) {
		this.shichang = shichang;
	}

	public String getHuiyuanno() {
        return huiyuanno;
    }

    public void setHuiyuanno(String huiyuanno) {
        this.huiyuanno = huiyuanno;
    }

    public String getKehuno() {
        return kehuno;
    }

    public void setKehuno(String kehuno) {
        this.kehuno = kehuno;
    }

    public String getHuiyuanname() {
        return huiyuanname;
    }

    public void setHuiyuanname(String huiyuanname) {
        this.huiyuanname = huiyuanname;
    }

    public Double getHuiyuanmoney() {
        return huiyuanmoney;
    }

    public void setHuiyuanmoney(Double huiyuanmoney) {
        this.huiyuanmoney = huiyuanmoney;
    }

    public Double getXiaofei() {
        return xiaofei;
    }

    public void setXiaofei(Double xiaofei) {
        this.xiaofei = xiaofei;
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

    public String getHuiyuangraden() {
        return huiyuangraden;
    }

    public void setHuiyuangraden(String huiyuangraden) {
        this.huiyuangraden = huiyuangraden;
    }

    public String getYouhui() {
        return youhui;
    }

    public void setYouhui(String youhui) {
        this.youhui = youhui;
    }

    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
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