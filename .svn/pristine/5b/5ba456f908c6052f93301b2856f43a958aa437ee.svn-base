package com.ccunix.icar.employees.service;

import java.util.List;

import com.ccunix.icar.employees.domain.Cart;
import com.ccunix.icar.employees.dto.CartExecution;

public interface CartService {
	/**
	 * 录入汽车信息
	 * @param cart
	 * @return
	 * @throws RuntimeException
	 */
	CartExecution addCart(Cart cart)throws RuntimeException;
	/**
	 * 结算
	 * @param cart
	 * @return
	 * @throws RuntimeException
	 */
	CartExecution settlement(Cart cart) throws RuntimeException;
	/**
	 * 查询所有车辆信息
	 */
	List<Cart> queryCart() throws Exception;
}
