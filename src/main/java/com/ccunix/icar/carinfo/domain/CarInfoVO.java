package com.ccunix.icar.carinfo.domain;

import java.io.Serializable;
import java.util.Date;

public class CarInfoVO implements Serializable {
	private	String cart_number;//车牌号
	private	Date input_time;//进入时间
	private	Date remove_time;//离开时间
	private String input_time_str;
	private String remove_time_str;
	
	private	int status;//是否结算
	public CarInfoVO() {
	}
	public CarInfoVO(String cart_number, Date input_time, Date remove_time,
			String input_time_str, String remove_time_str, int status) {
		this.cart_number = cart_number;
		this.input_time = input_time;
		this.remove_time = remove_time;
		this.input_time_str = input_time_str;
		this.remove_time_str = remove_time_str;
		this.status = status;
	}
	public String getCart_number() {
		return cart_number;
	}
	public void setCart_number(String cart_number) {
		this.cart_number = cart_number;
	}
	public Date getInput_time() {
		return input_time;
	}
	public void setInput_time(Date input_time) {
		this.input_time = input_time;
	}
	public Date getRemove_time() {
		return remove_time;
	}
	public void setRemove_time(Date remove_time) {
		this.remove_time = remove_time;
	}
	public String getInput_time_str() {
		return input_time_str;
	}
	public void setInput_time_str(String input_time_str) {
		this.input_time_str = input_time_str;
	}
	public String getRemove_time_str() {
		return remove_time_str;
	}
	public void setRemove_time_str(String remove_time_str) {
		this.remove_time_str = remove_time_str;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
