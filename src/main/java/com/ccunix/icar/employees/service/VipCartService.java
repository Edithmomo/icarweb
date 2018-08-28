package com.ccunix.icar.employees.service;

import com.ccunix.icar.employees.domain.Cart;
import com.ccunix.icar.employees.domain.VipCart;
import com.ccunix.icar.employees.dto.VipCartExecution;

public interface VipCartService {
	/**
	 * 办理包月
	 * @param vipCart
	 * @return
	 */
	VipCartExecution addVipCart(VipCart vipCart);
	/**
	 * 续费
	 * @param vipCart
	 * @return
	 */
	VipCartExecution renewal(Cart Cart,int renewalDays);
}
