package com.ccunix.icar.employees.domain;

import java.util.Date;

public class Cart {
	private int id;// 主键
	private String cartNumber;// 车牌
	private Date inputTime;
	private Date removeTime;
	private int status;// 是否结算  0未 计算 1结算
	private Moneyinfo moneyinfo;// 收费类别
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	public Cart(String cartNumber, Date inputTime, Date removeTime, int status) {
		super();
		this.cartNumber = cartNumber;
		this.inputTime = inputTime;
		this.removeTime = removeTime;
		this.status = status;
	}

	public Cart(Moneyinfo moneyinfo, String cartNumber, Date inputTime,
			Date removeTime, int status) {
		super();
		this.moneyinfo = moneyinfo;
		this.cartNumber = cartNumber;
		this.inputTime = inputTime;
		this.removeTime = removeTime;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getCartNumber() {
		return cartNumber;
	}

	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}

	public Date getInputTime() {
		return inputTime;
	}

	public void setInputTime(Date inputTime) {
		this.inputTime = inputTime;
	}

	public Date getRemoveTime() {
		return removeTime;
	}

	public void setRemoveTime(Date removeTime) {
		this.removeTime = removeTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Moneyinfo getMoneyinfo() {
		return moneyinfo;
	}

	public void setMoneyinfo(Moneyinfo moneyinfo) {
		this.moneyinfo = moneyinfo;
	}
	
}
