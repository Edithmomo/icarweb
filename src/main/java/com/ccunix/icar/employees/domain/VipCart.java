package com.ccunix.icar.employees.domain;

import java.util.Date;

public class VipCart {
	private String cartNumber;
	private String vipName;
	private String vipPhone;
	private Date startTime;
	private Date endTime;
	private String startTimeStr;
	private String endTimeStr;
	private int time;
	private int status;//表示是否到期 0是为到期 1是已到期
	public VipCart() {
		// TODO Auto-generated constructor stub
	}
	public VipCart(String cartNumber, String vipName, String vipPhone,
			Date startTime, Date endTime) {
		super();
		this.cartNumber = cartNumber;
		this.vipName = vipName;
		this.vipPhone = vipPhone;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getCartNumber() {
		return cartNumber;
	}
	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}
	public String getvipName() {
		return vipName;
	}
	public void setvipName(String vipName) {
		this.vipName = vipName;
	}
	public String getVipPhone() {
		return vipPhone;
	}
	public void setVipPhone(String vipPhone) {
		this.vipPhone = vipPhone;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getStartTimeStr() {
		return startTimeStr;
	}
	public void setStartTimeStr(String startTimeStr) {
		this.startTimeStr = startTimeStr;
	}
	public String getEndTimeStr() {
		return endTimeStr;
	}
	public void setEndTimeStr(String endTimeStr) {
		this.endTimeStr = endTimeStr;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
}
