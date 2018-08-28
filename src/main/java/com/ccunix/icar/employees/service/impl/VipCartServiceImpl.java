package com.ccunix.icar.employees.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.employees.dao.VipCartDao;
import com.ccunix.icar.employees.domain.Cart;
import com.ccunix.icar.employees.domain.VipCart;
import com.ccunix.icar.employees.dto.VipCartExecution;
import com.ccunix.icar.employees.enums.VipCartEnum;
import com.ccunix.icar.employees.service.VipCartService;
@Service
public class VipCartServiceImpl implements VipCartService{
	@Autowired
	private VipCartDao vipCartDao;
	
	@Transactional
	@Override
	public VipCartExecution addVipCart(VipCart vipCart) {
		if(vipCart!=null && vipCart.getCartNumber()!=null){
			try {
				int num=vipCartDao.insertVipCart(vipCart);
				if(num<=0){
					throw new RuntimeException("办理包月失败");
				}else{
					return new VipCartExecution(VipCartEnum.SUCCESS, vipCart);
				}
			} catch (Exception e) {
				throw new RuntimeException(e.toString());
			}
		}else{
			return new VipCartExecution(VipCartEnum.EMPTY);
		}
	}

	@Override
	public VipCartExecution renewal(Cart cart,int renewalDays) {
		if(cart!=null && cart.getCartNumber()!=null){
			VipCart vipCart=vipCartDao.queryVipCartByCartId(cart);
			Date endTime=vipCart.getEndTime();
			Date today=new Date();
			if(endTime.getTime()-today.getTime()>0){
				long time=endTime.getTime()+((long)renewalDays*31*24*60*60*1000);
				Date date=new Date(time);
				vipCart.setEndTime(date);
				try {
					int num=vipCartDao.updateVipCart(vipCart);
					if(num<=0){
						throw new RuntimeException("续费失败");
					}else{
						return new VipCartExecution(VipCartEnum.SUCCESS, vipCart);
					}
				} catch (Exception e) {
					throw new RuntimeException(e.toString());
				}
			}else{
				vipCart.setStartTime(today);
				long time=today.getTime()+((long)renewalDays*31*24*60*60*1000);
				Date date=new Date(time);
				vipCart.setEndTime(date);
				try {
					int num=vipCartDao.updateVipCart(vipCart);
					if(num<=0){
						throw new RuntimeException("续费失败");
					}else{
						return new VipCartExecution(VipCartEnum.SUCCESS, vipCart);
					}
				} catch (Exception e) {
					throw new RuntimeException(e.toString());
				}
			}
		}else{
			return new VipCartExecution(VipCartEnum.EMPTY);
		}
	}

}
