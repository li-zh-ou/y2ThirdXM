package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Jinritixin {
    private Integer id;

    private Integer jiechetaici;

    private Integer jiesuantaici;

    private Integer zaixiutaici;

    private Integer shobaotaici;

    private Integer fanxiutaici;

    private Integer znweixiutaici;

    private Integer zwweixiutaici;

    private Double zfeiweixiuzhi;

    private Double baoxianlipei;

    private Double xianjin;

    private Double weixin;

    private Integer xianjinrkucishu;

    private Double xianjinrkujine;

    private Integer guazhanrkushu;

    private Double guazhanrkujine;

    private Integer xiaoshoushul;

    private Integer zfeichukushul;

    private Double zfeichukujine;

    private Integer sanbaorkushul;

    private Double sanbaorkujine;

    private Integer danqiankucshul;

    private Double danqiankucjine;

    private Double guazhang;

    private Double yinhangzhanghu;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date dantianshijian;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJiechetaici() {
        return jiechetaici;
    }

    public void setJiechetaici(Integer jiechetaici) {
        this.jiechetaici = jiechetaici;
    }

    public Integer getJiesuantaici() {
        return jiesuantaici;
    }

    public void setJiesuantaici(Integer jiesuantaici) {
        this.jiesuantaici = jiesuantaici;
    }

    public Integer getZaixiutaici() {
        return zaixiutaici;
    }

    public void setZaixiutaici(Integer zaixiutaici) {
        this.zaixiutaici = zaixiutaici;
    }

    public Integer getShobaotaici() {
        return shobaotaici;
    }

    public void setShobaotaici(Integer shobaotaici) {
        this.shobaotaici = shobaotaici;
    }

    public Integer getFanxiutaici() {
        return fanxiutaici;
    }

    public void setFanxiutaici(Integer fanxiutaici) {
        this.fanxiutaici = fanxiutaici;
    }

    public Integer getZnweixiutaici() {
        return znweixiutaici;
    }

    public void setZnweixiutaici(Integer znweixiutaici) {
        this.znweixiutaici = znweixiutaici;
    }

    public Integer getZwweixiutaici() {
        return zwweixiutaici;
    }

    public void setZwweixiutaici(Integer zwweixiutaici) {
        this.zwweixiutaici = zwweixiutaici;
    }

    public Double getZfeiweixiuzhi() {
        return zfeiweixiuzhi;
    }

    public void setZfeiweixiuzhi(Double zfeiweixiuzhi) {
        this.zfeiweixiuzhi = zfeiweixiuzhi;
    }

    public Double getBaoxianlipei() {
        return baoxianlipei;
    }

    public void setBaoxianlipei(Double baoxianlipei) {
        this.baoxianlipei = baoxianlipei;
    }

    public Double getXianjin() {
        return xianjin;
    }

    public void setXianjin(Double xianjin) {
        this.xianjin = xianjin;
    }

    public Double getWeixin() {
        return weixin;
    }

    public void setWeixin(Double weixin) {
        this.weixin = weixin;
    }

    public Integer getXianjinrkucishu() {
        return xianjinrkucishu;
    }

    public void setXianjinrkucishu(Integer xianjinrkucishu) {
        this.xianjinrkucishu = xianjinrkucishu;
    }

    public Double getXianjinrkujine() {
        return xianjinrkujine;
    }

    public void setXianjinrkujine(Double xianjinrkujine) {
        this.xianjinrkujine = xianjinrkujine;
    }

    public Integer getGuazhanrkushu() {
        return guazhanrkushu;
    }

    public void setGuazhanrkushu(Integer guazhanrkushu) {
        this.guazhanrkushu = guazhanrkushu;
    }

    public Double getGuazhanrkujine() {
        return guazhanrkujine;
    }

    public void setGuazhanrkujine(Double guazhanrkujine) {
        this.guazhanrkujine = guazhanrkujine;
    }

    public Integer getXiaoshoushul() {
        return xiaoshoushul;
    }

    public void setXiaoshoushul(Integer xiaoshoushul) {
        this.xiaoshoushul = xiaoshoushul;
    }

    public Integer getZfeichukushul() {
        return zfeichukushul;
    }

    public void setZfeichukushul(Integer zfeichukushul) {
        this.zfeichukushul = zfeichukushul;
    }

    public Double getZfeichukujine() {
        return zfeichukujine;
    }

    public void setZfeichukujine(Double zfeichukujine) {
        this.zfeichukujine = zfeichukujine;
    }

    public Integer getSanbaorkushul() {
        return sanbaorkushul;
    }

    public void setSanbaorkushul(Integer sanbaorkushul) {
        this.sanbaorkushul = sanbaorkushul;
    }

    public Double getSanbaorkujine() {
        return sanbaorkujine;
    }

    public void setSanbaorkujine(Double sanbaorkujine) {
        this.sanbaorkujine = sanbaorkujine;
    }

    public Integer getDanqiankucshul() {
        return danqiankucshul;
    }

    public void setDanqiankucshul(Integer danqiankucshul) {
        this.danqiankucshul = danqiankucshul;
    }

    public Double getDanqiankucjine() {
        return danqiankucjine;
    }

    public void setDanqiankucjine(Double danqiankucjine) {
        this.danqiankucjine = danqiankucjine;
    }

    public Double getGuazhang() {
        return guazhang;
    }

    public void setGuazhang(Double guazhang) {
        this.guazhang = guazhang;
    }

    public Double getYinhangzhanghu() {
        return yinhangzhanghu;
    }

    public void setYinhangzhanghu(Double yinhangzhanghu) {
        this.yinhangzhanghu = yinhangzhanghu;
    }

    public Date getDantianshijian() {
        return dantianshijian;
    }

    public void setDantianshijian(Date dantianshijian) {
        this.dantianshijian = dantianshijian;
    }
}