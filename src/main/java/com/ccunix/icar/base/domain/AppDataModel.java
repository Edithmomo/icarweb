package com.ccunix.icar.base.domain;

public class AppDataModel {

	/**
	 * 数据
	 */
	private String data;
	/**
	 * 状�?? 0-失败 1-成功
	 */
	private Integer status=1;
	
	/**
	 * 服务端异常信�?
	 */
	private String message;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
