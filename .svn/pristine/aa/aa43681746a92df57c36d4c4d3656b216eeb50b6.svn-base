package com.ccunix.icar.employeesmanager.domain;

import java.io.Serializable;
import java.util.Date;

public class UserCurd implements Serializable{
	/**
	 * 员工修改信息id
	 */
	private int id;
	/**
	 * 操作类型 如增加 删除 修改
	 */
	private String curd_type;
	/**
	 * 操作员工的工号
	 */
	private String curd_user_number;
	/**
	 * 被操作的员工id
	 */
	private int user_id;
	/**
	 * 操作原因
	 */
	private String reason;
	/**
	 * 操作时间
	 */
	private Date time;

	public UserCurd() {
	}

	public UserCurd(int id, String curd_type, String curd_user_number,
			int user_id, String reason, Date time) {
		this.id = id;
		this.curd_type = curd_type;
		this.curd_user_number = curd_user_number;
		this.user_id = user_id;
		this.reason = reason;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurd_type() {
		return curd_type;
	}

	public void setCurd_type(String curd_type) {
		this.curd_type = curd_type;
	}

	public String getCurd_user_number() {
		return curd_user_number;
	}

	public void setCurd_user_number(String curd_user_number) {
		this.curd_user_number = curd_user_number;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String toUserCurdString() {
		return "id=" + this.id + "curd_type=" + this.curd_type + "curd_user_number="
				+ this.curd_user_number + "user_id=" + this.user_id + "reason=" + this.reason
				+ "time=" + this.time;
	}
}
