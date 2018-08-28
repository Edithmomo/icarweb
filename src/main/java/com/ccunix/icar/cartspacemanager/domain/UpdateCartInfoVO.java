package com.ccunix.icar.cartspacemanager.domain;

import java.io.Serializable;
import java.util.Date;

public class UpdateCartInfoVO implements Serializable {
	/**
	 * 更新车位记录表id
	 */
	private int id;
	/**
	 * 操作类型id 1 增加  2 减少
	 */
	private int operations_id;
	/**
	 * 操作类型
	 */
	private String operations_id_str;
	/**
	 * 操作员工工号
	 */
	private int user_number;
	/**
	 * 修改数量
	 */
	private int num;
	/**
	 * 修改原因
	 */
	private String reason;
	/**
	 * 修改时间
	 */
	private Date time;

	public UpdateCartInfoVO() {
	}

	public UpdateCartInfoVO(int id, int operations_id,
			String operations_id_str, int user_number, int num, String reason, Date time) {
		this.id = id;
		this.operations_id = operations_id;
		this.operations_id_str = operations_id_str;
		this.user_number = user_number;
		this.num = num;
		this.reason = reason;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOperations_id() {
		return operations_id;
	}

	public void setOperations_id(int operations_id) {
		this.operations_id = operations_id;
	}

	public String getOperations_id_str() {
		return operations_id_str;
	}

	public void setOperations_id_str(String operations_id_str) {
		this.operations_id_str = operations_id_str;
	}

	public int getUser_number() {
		return user_number;
	}

	public void setUser_number(int user_number) {
		this.user_number = user_number;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	
}
