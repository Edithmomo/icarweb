package com.ccunix.icar.employees.dto;

import com.ccunix.icar.employees.domain.VipCart;

import com.ccunix.icar.employees.enums.VipCartEnum;

public class VipCartExecution {
	 /**
     * 结果状态
     */
    private int state;

    /**
     * 状态标识
     */
    private String stateInfo; 
	private VipCart vipCart;
	public VipCartExecution() {
		// TODO Auto-generated constructor stub
	}
	public VipCartExecution(VipCartEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }
    public VipCartExecution(VipCartEnum stateEnum, VipCart vipCart) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.vipCart = vipCart;
    }
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public VipCart getVipCart() {
		return vipCart;
	}
	public void setVipCart(VipCart vipCart) {
		this.vipCart = vipCart;
	}
	
}
