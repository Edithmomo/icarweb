package com.ccunix.icar.employees.domain;

public class Moneyinfo {
	private int moneyinfoId;//主鍵
	private String moneyKind;
	private double price;
	public Moneyinfo() {
		// TODO Auto-generated constructor stub
	}
	public Moneyinfo(String moneyKind, double price) {
		super();
		this.moneyKind = moneyKind;
		this.price = price;
	}
	public int getId() {
		return moneyinfoId;
	}
	public void setId(int moneyinfoId) {
		moneyinfoId = moneyinfoId;
	}
	public String getMoneyKind() {
		return moneyKind;
	}
	public void setMoneyKind(String moneyKind) {
		this.moneyKind = moneyKind;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMoneyinfoId() {
		return moneyinfoId;
	}
	public void setMoneyinfoId(int moneyinfoId) {
		this.moneyinfoId = moneyinfoId;
	}
	
}
