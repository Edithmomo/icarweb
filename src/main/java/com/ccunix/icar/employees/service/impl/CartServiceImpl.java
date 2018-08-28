package com.ccunix.icar.employees.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.employees.dao.CartDao;
import com.ccunix.icar.employees.dao.VipCartDao;
import com.ccunix.icar.employees.domain.Cart;
import com.ccunix.icar.employees.domain.Moneyinfo;
import com.ccunix.icar.employees.domain.VipCart;
import com.ccunix.icar.employees.dto.CartExecution;
import com.ccunix.icar.employees.enums.CartStateEnum;
import com.ccunix.icar.employees.service.CartService;
import com.ccunix.icar.employees.util.timeUtil;
@Service
public class CartServiceImpl implements CartService{
	
	
	@Autowired
	private CartDao cartDao;
	@Autowired
	private VipCartDao vipCartDao;
	
	@Override
	@Transactional
	public CartExecution addCart(Cart cart) throws RuntimeException {
		if(cart!=null){
			VipCart vipCart=vipCartDao.queryVipCartByCartId(cart);
			Moneyinfo moneyinfo=new Moneyinfo();
			boolean isVip;
			if(vipCart!=null){
				//判断是否过期
				Date endTime=vipCart.getEndTime();
				Date date=new Date();
				if(endTime.getTime()-date.getTime()>0){
					moneyinfo.setMoneyinfoId(1);
					cart.setMoneyinfo(moneyinfo);
					isVip=true;
				}else{
					try {
						int status=1;
						vipCart.setStatus(1);
						int effectNum=vipCartDao.updateVipCart(vipCart);
						if(effectNum<=0){
							throw new RuntimeException("修改信息失败");
						}else{
							moneyinfo.setId(0);
							cart.setMoneyinfo(moneyinfo);
							isVip=false;
						}
					} catch (Exception e) {
						throw new RuntimeException(e.toString());
					}
				}		
			}else{
				moneyinfo.setId(0);
				cart.setMoneyinfo(moneyinfo);
				isVip=false;
			}
			cart.setInputTime(new Date());
			cart.setStatus(0);
			try {
				int num=cartDao.insertCart(cart);
				if(num<=0){
					throw new RuntimeException("车牌号录入失败");
				}else{
					return new CartExecution(CartStateEnum.SUCCESS, cart,isVip);
				}
			} catch (Exception e) {
				throw new RuntimeException(e.toString());
			}
		}else{
			return new CartExecution(CartStateEnum.EMPTY);
		}
	}
	@Override
	@Transactional
	public CartExecution settlement(Cart cart) throws RuntimeException{
		if(cart!=null){
			//设定离开时的时间
			Date removeTime=new Date();
			cart.setRemoveTime(removeTime);
			//设定状态为离开
			cart.setStatus(1);
			VipCart vipcart=vipCartDao.queryVipCartByCartId(cart);	
			if(vipcart!=null && vipcart.getStatus()==0){
				try {
					int emum=cartDao.updateCart(cart);
					if(emum<=0){
						throw new RuntimeException("修改失败");
					}else{
						return new CartExecution(CartStateEnum.SUCCESS, cart, true);
					}
				} catch (Exception e) {
					throw new RuntimeException(e.toString());
				}
			}else{
				double payMoney;
				Cart currentCart;
				try {
					currentCart=cartDao.queryCartByCartId(cart);
					Date startTime=currentCart.getInputTime();
					long date;
					double Price=currentCart.getMoneyinfo().getPrice();
					date=timeUtil.towDatesDelay(startTime, removeTime);
					payMoney=Price*date;	
					int emum;
					try {
						emum=cartDao.updateCart(cart);
						if(emum<=0){
							throw new RuntimeException("修改失败");
						}else{
							return new CartExecution(CartStateEnum.SUCCESS, cart, payMoney);
						}
					} catch (Exception e) {
						throw new RuntimeException(e.toString());
					}
				} catch (Exception e) {
					throw new RuntimeException(e.toString());
				}	
			}	
		}else{
			return new CartExecution(CartStateEnum.EMPTY);
		}
		
	}
	@Override
	public List<Cart> queryCart() throws Exception {
		List<Cart> carts=new ArrayList<>();
		try {
			carts=cartDao.queryCart();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return carts;
	}
}
