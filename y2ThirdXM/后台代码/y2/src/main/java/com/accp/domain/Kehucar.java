package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Kehucar {
    private String chepai;

    private String kehuno;

    private Integer carbankid;

    private String xinghao;

    private String sijiname;

    private String sijiphone;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date sijibirthday;

    private String guishu;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date jiazhao;

    private String chejia;

    private Integer fabankid;

    private Double niankuan;

    private Integer licheng;

    private Integer zaizhong;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date goumaidate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date shanpaidate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date chejian;

    private String ranyou;

    private String chexi;

    private Integer nextbaoxian;

    private Date nextbaoxiandate;

    private String bei1;

    private String bei2;

    private String bei3;

    private String bei4;
    
    private String carbankname;
    
    private String firstwork;
    
    private String faname;
    
    public String getCarbankname() {
		return carbankname;
	}

	public void setCarbankname(String carbankname) {
		this.carbankname = carbankname;
	}

	public String getFirstwork() {
		return firstwork;
	}

	public void setFirstwork(String firstwork) {
		this.firstwork = firstwork;
	}

	public String getFaname() {
		return faname;
	}

	public void setFaname(String faname) {
		this.faname = faname;
	}

	public String getFanumber() {
		return fanumber;
	}

	public void setFanumber(String fanumber) {
		this.fanumber = fanumber;
	}

	private String fanumber;

    public String getChepai() {
        return chepai;
    }

    public void setChepai(String chepai) {
        this.chepai = chepai;
    }

    public String getKehuno() {
        return kehuno;
    }

    public void setKehuno(String kehuno) {
        this.kehuno = kehuno;
    }

    public Integer getCarbankid() {
        return carbankid;
    }

    public void setCarbankid(Integer carbankid) {
        this.carbankid = carbankid;
    }

    public String getXinghao() {
        return xinghao;
    }

    public void setXinghao(String xinghao) {
        this.xinghao = xinghao;
    }

    public String getSijiname() {
        return sijiname;
    }

    public void setSijiname(String sijiname) {
        this.sijiname = sijiname;
    }

    public String getSijiphone() {
        return sijiphone;
    }

    public void setSijiphone(String sijiphone) {
        this.sijiphone = sijiphone;
    }

    public Date getSijibirthday() {
        return sijibirthday;
    }

    public void setSijibirthday(Date sijibirthday) {
        this.sijibirthday = sijibirthday;
    }

    public String getGuishu() {
        return guishu;
    }

    public void setGuishu(String guishu) {
        this.guishu = guishu;
    }

    public Date getJiazhao() {
        return jiazhao;
    }

    public void setJiazhao(Date jiazhao) {
        this.jiazhao = jiazhao;
    }

    public String getChejia() {
        return chejia;
    }

    public void setChejia(String chejia) {
        this.chejia = chejia;
    }

    public Integer getFabankid() {
        return fabankid;
    }

    public void setFabankid(Integer fabankid) {
        this.fabankid = fabankid;
    }

    public Double getNiankuan() {
        return niankuan;
    }

    public void setNiankuan(Double niankuan) {
        this.niankuan = niankuan;
    }

    public Integer getLicheng() {
        return licheng;
    }

    public void setLicheng(Integer licheng) {
        this.licheng = licheng;
    }

    public Integer getZaizhong() {
        return zaizhong;
    }

    public void setZaizhong(Integer zaizhong) {
        this.zaizhong = zaizhong;
    }

    public Date getGoumaidate() {
        return goumaidate;
    }

    public void setGoumaidate(Date goumaidate) {
        this.goumaidate = goumaidate;
    }

    public Date getShanpaidate() {
        return shanpaidate;
    }

    public void setShanpaidate(Date shanpaidate) {
        this.shanpaidate = shanpaidate;
    }

    public Date getChejian() {
        return chejian;
    }

    public void setChejian(Date chejian) {
        this.chejian = chejian;
    }

    public String getRanyou() {
        return ranyou;
    }

    public void setRanyou(String ranyou) {
        this.ranyou = ranyou;
    }

    public String getChexi() {
        return chexi;
    }

    public void setChexi(String chexi) {
        this.chexi = chexi;
    }

    public Integer getNextbaoxian() {
        return nextbaoxian;
    }

    public void setNextbaoxian(Integer nextbaoxian) {
        this.nextbaoxian = nextbaoxian;
    }

    public Date getNextbaoxiandate() {
        return nextbaoxiandate;
    }

    public void setNextbaoxiandate(Date nextbaoxiandate) {
        this.nextbaoxiandate = nextbaoxiandate;
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