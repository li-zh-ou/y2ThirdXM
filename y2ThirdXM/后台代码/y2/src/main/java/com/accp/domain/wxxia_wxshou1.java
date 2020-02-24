package com.accp.domain;

public class wxxia_wxshou1 {

	private String pname;
	private Integer xiangmuno;
	private String xiangmuname;
	private String shoujiaan;
	private String shourutype;
	private Double price;
	private Double huiprice;
	private Double vipprice;
	private Double xieprice;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getXiangmuno() {
		return xiangmuno;
	}
	public void setXiangmuno(Integer xiangmuno) {
		this.xiangmuno = xiangmuno;
	}
	public String getXiangmuname() {
		return xiangmuname;
	}
	public void setXiangmuname(String xiangmuname) {
		this.xiangmuname = xiangmuname;
	}
	public String getShoujiaan() {
		return shoujiaan;
	}
	public void setShoujiaan(String shoujiaan) {
		this.shoujiaan = shoujiaan;
	}
	public String getShourutype() {
		return shourutype;
	}
	public void setShourutype(String shourutype) {
		this.shourutype = shourutype;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getHuiprice() {
		return huiprice;
	}
	public void setHuiprice(Double huiprice) {
		this.huiprice = huiprice;
	}
	public Double getVipprice() {
		return vipprice;
	}
	public void setVipprice(Double vipprice) {
		this.vipprice = vipprice;
	}
	public Double getXieprice() {
		return xieprice;
	}
	public void setXieprice(Double xieprice) {
		this.xieprice = xieprice;
	}
	public wxxia_wxshou1() {
		super();
	}
	public wxxia_wxshou1(String pname, Integer xiangmuno, String xiangmuname, String shoujiaan, String shourutype,
			Double price, Double huiprice, Double vipprice, Double xieprice) {
		super();
		this.pname = pname;
		this.xiangmuno = xiangmuno;
		this.xiangmuname = xiangmuname;
		this.shoujiaan = shoujiaan;
		this.shourutype = shourutype;
		this.price = price;
		this.huiprice = huiprice;
		this.vipprice = vipprice;
		this.xieprice = xieprice;
	}
	
}
