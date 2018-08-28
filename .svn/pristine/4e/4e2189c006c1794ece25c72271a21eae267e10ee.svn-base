package com.ccunix.icar.employees.dto;

import com.ccunix.icar.employees.domain.Cart;
import com.ccunix.icar.employees.enums.CartStateEnum;


public class CartExecution {
	 /**
     * 结果状态
     */
    private int state;

    /**
     * 状态标识
     */
    private String stateInfo; 
	private Cart cart;
	private double payMoney;
	private boolean vipCart=false;
	public CartExecution() {
		// TODO Auto-generated constructor stub
	}
	/**
     * 商品操作失败时使用的构造器
     */
    public CartExecution(CartStateEnum stateEnum) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }
    /**
     * 商品操作成功时使用的构造器
     */
    public CartExecution(CartStateEnum stateEnum, Cart cart) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.cart = cart;
    }
    public CartExecution(CartStateEnum stateEnum, Cart cart,double payMoney) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.cart = cart;
        this.payMoney=payMoney;
    }
    public CartExecution(CartStateEnum stateEnum, Cart cart,boolean vipCart) {
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.cart = cart;
        this.vipCart=vipCart;
    }
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
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
	public double getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(double payMoney) {
		this.payMoney = payMoney;
	}
	public boolean isVipCart() {
		return vipCart;
	}
	public void setVipCart(boolean vipCart) {
		this.vipCart = vipCart;
	}
	
}
