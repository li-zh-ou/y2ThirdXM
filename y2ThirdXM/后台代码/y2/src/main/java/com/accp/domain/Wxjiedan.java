package com.accp.domain;

import java.util.Date;

public class Wxjiedan {
	private String wxdanno;

    private String wxdantype;

    private String wxtype;

    private String danjustatu;

    private String kaidantime;

    private String kehunno;

    private String chepai;

    private Integer carbankid;

    private String carxinghao;

    private String chejiaxinghao;

    private String fanumber;

    private Integer fabankid;

    private String guwen;

    private String chezhu;

    private String sijiname;

    private String lianphone;

    private Integer jinchanli;

    private Integer jinchanyou;

    private Integer prevli;

    private String prevtime;

    private String jinchantime;

    private String yewutype;

    private String shigong;

    private String jieche;

    private String yujitime;

    private String wangongtime;

    private String jiesuantype;

    private String jiesuantime;

    private Double jiesuanmoney;

    private String peikuan;

    private Double money;

    private String saleno;

    private String baoxiu;

    private String remark;

    private String bei1;

    private String bei2;

    private String bei3;

    private String bei4;

	private String huiyuanno;
    
    private Double huiyuanmoney;
    
    private String kehuname;
    
    private Integer atfertime;
    
    private String carbankname;
    
    private String faname;
    
    private Double jifen;
    
    private Double guazhang;
    
	private Double dinjin;
	
	private String kehuno;
	
	private String chejia;
	 
	private String xinghao;
    
    public String getKehuno() {
		return kehuno;
	}

	public void setKehuno(String kehuno) {
		this.kehuno = kehuno;
	}

	public String getChejia() {
		return chejia;
	}

	public void setChejia(String chejia) {
		this.chejia = chejia;
	}

	public String getXinghao() {
		return xinghao;
	}

	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}

	public Double getJifen() {
    	if(jifen==null) {
			return 0.0;
		}else {
			return jifen;
		}
	}

	public void setJifen(Double jifen) {
		this.jifen = jifen;
	}

	public Double getGuazhang() {
		if(guazhang==null) {
			return 0.0;
		}else {
			return guazhang;
		}
	}

	public void setGuazhang(Double guazhang) {
		this.guazhang = guazhang;
	}

	public Double getDinjin() {
		if(dinjin==null) {
			return 0.0;
		}else {
			return dinjin;
		}
	}

	public void setDinjin(Double dinjin) {
		this.dinjin = dinjin;
	}

    
    public String getCarbankname() {
		return carbankname;
	}

	public void setCarbankname(String carbankname) {
		this.carbankname = carbankname;
	}

	public String getFaname() {
		return faname;
	}

	public void setFaname(String faname) {
		this.faname = faname;
	}

	public Integer getAtfertime() {
		return atfertime;
	}

	public void setAtfertime(Integer atfertime) {
		this.atfertime = atfertime;
	}

	public String getKehuname() {
		return kehuname;
	}

	public void setKehuname(String kehuname) {
		this.kehuname = kehuname;
	}

	public String getHuiyuanno() {
		return huiyuanno;
	}

	public void setHuiyuanno(String huiyuanno) {
		this.huiyuanno = huiyuanno;
	}

	public Double getHuiyuanmoney() {
		if(huiyuanmoney==null) {
			return 0.0;
		}else {
			return huiyuanmoney;
		}
	}

	public void setHuiyuanmoney(Double huiyuanmoney) {
		this.huiyuanmoney = huiyuanmoney;
	}

    public String getWxdanno() {
        return wxdanno;
    }

    public void setWxdanno(String wxdanno) {
        this.wxdanno = wxdanno;
    }

    public String getWxdantype() {
        return wxdantype;
    }

    public void setWxdantype(String wxdantype) {
        this.wxdantype = wxdantype;
    }

    public String getWxtype() {
        return wxtype;
    }

    public void setWxtype(String wxtype) {
        this.wxtype = wxtype;
    }

    public String getDanjustatu() {
        return danjustatu;
    }

    public void setDanjustatu(String danjustatu) {
        this.danjustatu = danjustatu;
    }

    public String getKaidantime() {
        return kaidantime;
    }

    public void setKaidantime(String kaidantime) {
        this.kaidantime = kaidantime;
    }

    public String getKehunno() {
        return kehunno;
    }

    public void setKehunno(String kehunno) {
        this.kehunno = kehunno;
    }

    public String getChepai() {
        return chepai;
    }

    public void setChepai(String chepai) {
        this.chepai = chepai;
    }

    public Integer getCarbankid() {
        return carbankid;
    }

    public void setCarbankid(Integer carbankid) {
        this.carbankid = carbankid;
    }

    public String getCarxinghao() {
        return carxinghao;
    }

    public void setCarxinghao(String carxinghao) {
        this.carxinghao = carxinghao;
    }

    public String getChejiaxinghao() {
        return chejiaxinghao;
    }

    public void setChejiaxinghao(String chejiaxinghao) {
        this.chejiaxinghao = chejiaxinghao;
    }

    public String getFanumber() {
        return fanumber;
    }

    public void setFanumber(String fanumber) {
        this.fanumber = fanumber;
    }

    public Integer getFabankid() {
        return fabankid;
    }

    public void setFabankid(Integer fabankid) {
        this.fabankid = fabankid;
    }

    public String getGuwen() {
        return guwen;
    }

    public void setGuwen(String guwen) {
        this.guwen = guwen;
    }

    public String getChezhu() {
        return chezhu;
    }

    public void setChezhu(String chezhu) {
        this.chezhu = chezhu;
    }

    public String getSijiname() {
        return sijiname;
    }

    public void setSijiname(String sijiname) {
        this.sijiname = sijiname;
    }

    public String getLianphone() {
        return lianphone;
    }

    public void setLianphone(String lianphone) {
        this.lianphone = lianphone;
    }

    public Integer getJinchanli() {
        return jinchanli;
    }

    public void setJinchanli(Integer jinchanli) {
        this.jinchanli = jinchanli;
    }

    public Integer getJinchanyou() {
        return jinchanyou;
    }

    public void setJinchanyou(Integer jinchanyou) {
        this.jinchanyou = jinchanyou;
    }

    public Integer getPrevli() {
        return prevli;
    }

    public void setPrevli(Integer prevli) {
        this.prevli = prevli;
    }

    public String getPrevtime() {
        return prevtime;
    }

    public void setPrevtime(String prevtime) {
        this.prevtime = prevtime;
    }

    public String getJinchantime() {
        return jinchantime;
    }

    public void setJinchantime(String jinchantime) {
        this.jinchantime = jinchantime;
    }

    public String getYewutype() {
        return yewutype;
    }

    public void setYewutype(String yewutype) {
        this.yewutype = yewutype;
    }

    public String getShigong() {
        return shigong;
    }

    public void setShigong(String shigong) {
        this.shigong = shigong;
    }

    public String getJieche() {
        return jieche;
    }

    public void setJieche(String jieche) {
        this.jieche = jieche;
    }

    public String getYujitime() {
        return yujitime;
    }

    public void setYujitime(String yujitime) {
        this.yujitime = yujitime;
    }

    public String getWangongtime() {
        return wangongtime;
    }

    public void setWangongtime(String wangongtime) {
        this.wangongtime = wangongtime;
    }

    public String getJiesuantype() {
        return jiesuantype;
    }

    public void setJiesuantype(String jiesuantype) {
        this.jiesuantype = jiesuantype;
    }

    public String getJiesuantime() {
        return jiesuantime;
    }

    public void setJiesuantime(String jiesuantime) {
        this.jiesuantime = jiesuantime;
    }

    public Double getJiesuanmoney() {
        return jiesuanmoney;
    }

    public void setJiesuanmoney(Double jiesuanmoney) {
        this.jiesuanmoney = jiesuanmoney;
    }

    public String getPeikuan() {
        return peikuan;
    }

    public void setPeikuan(String peikuan) {
        this.peikuan = peikuan;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getSaleno() {
        return saleno;
    }

    public void setSaleno(String saleno) {
        this.saleno = saleno;
    }

    public String getBaoxiu() {
        return baoxiu;
    }

    public void setBaoxiu(String baoxiu) {
        this.baoxiu = baoxiu;
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