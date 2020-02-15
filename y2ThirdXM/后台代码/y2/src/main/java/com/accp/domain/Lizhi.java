package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Lizhi {
    private String yuanno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
	@JsonFormat(pattern = "yyyy-MM-dd")
    private Date lizhitime;

    private String remark;

    private String bei1;

    private String bei2;

    private String bei3;

    private String bei4;

    public String getYuanno() {
        return yuanno;
    }

    public void setYuanno(String yuanno) {
        this.yuanno = yuanno;
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