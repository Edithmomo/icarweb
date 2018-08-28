package com.ccunix.icar.employeesmanager.domain;

import java.io.Serializable;

public class UserInfo implements Serializable {
	/**
	 * 员工id
	 */
	private int user_id;
	/**
	 * 员工类型 1-普通员工 2-管理员
	 */
	private int kind_id;
	/**
	 * 员工编号
	 */
	private String user_number;
	/**
	 * 登录密码
	 */
	private String user_pw;
	/**
	 * 员工姓名
	 */
	private String user_name;
	/**
	 * 员工电话
	 */
	private String user_phone;
	/**
	 * 员工身份证号
	 */
	private String user_card;
	/**
	 * 是否离职 1-在职 0-离职
	 */
	private int status;

	public UserInfo() {
	}

	public UserInfo(int user_id, int kind_id, String user_number,
			String user_pw, String user_name, String user_phone,
			String user_card, int status) {
		this.user_id = user_id;
		this.kind_id = kind_id;
		this.user_number = user_number;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_phone = user_phone;
		this.user_card = user_card;
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getKind_id() {
		return kind_id;
	}

	public void setKind_id(int kind_id) {
		this.kind_id = kind_id;
	}

	public String getUser_number() {
		return user_number;
	}

	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public String getUser_card() {
		return user_card;
	}

	public void setUser_card(String user_card) {
		this.user_card = user_card;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String toUserInfoString() {
		// TODO Auto-generated method stub
		return "user_id=" + this.user_id + "kind_id=" + this.kind_id + "user_number="
				+ this.user_number + "user_pw=" + this.user_pw + "user_name=" + this.user_name
				+ "user_phone=" +this.user_phone + "user_card=" + this.user_card + "status="
				+ this.status;
	}
}
