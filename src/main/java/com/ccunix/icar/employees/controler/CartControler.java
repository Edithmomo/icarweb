package com.ccunix.icar.employees.controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.employees.domain.Cart;
import com.ccunix.icar.employees.domain.Moneyinfo;
import com.ccunix.icar.employees.dto.CartExecution;
import com.ccunix.icar.employees.enums.CartStateEnum;
import com.ccunix.icar.employees.service.CartService;

@RequestMapping("/cartadmin")
@Controller
public class CartControler {
	@Autowired
	private CartService cartService;
	@RequestMapping(value = "/addCart", method = RequestMethod.POST)
	@ResponseBody
	private Map<String, Object> addCart(Cart cart){
		Map<String, Object> modelMap=new HashMap<String, Object>();
		if(cart!=null&&cart.getCartNumber()!=null){
			try {
				CartExecution cartExecution=cartService.addCart(cart);
				if(cartExecution.getState()==CartStateEnum.SUCCESS.getState()){
					if(cartExecution.isVipCart()==true){
						modelMap.put("success", true);
						modelMap.put("isVip", true);
					}else{
						modelMap.put("success", true);
						modelMap.put("isVip", false);
					}
				}else{
					modelMap.put("success", false);
					modelMap.put("errMsg", cartExecution.getStateInfo());
				}
			} catch (Exception e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.toString());
			}
		}else{
			modelMap.put("success", false);
			modelMap.put("errMsg", "请输入车牌号");
		}
		return modelMap;
	}
	@RequestMapping(value = "/settlement", method = RequestMethod.POST)
	@ResponseBody
	private Map<String, Object> settlement(Cart cart){
		Map<String , Object> modelMap=new HashMap<String, Object>();
		if(cart!=null&&cart.getCartNumber()!=null){
			try {
				CartExecution cartExecution=cartService.settlement(cart);
				if(cartExecution.getState()==CartStateEnum.SUCCESS.getState()){
					if(cartExecution.isVipCart()==true){
						modelMap.put("success", true);
						modelMap.put("isVip", true);
					}else{
						modelMap.put("success", true);
						modelMap.put("payMoney", cartExecution.getPayMoney());
					}
				}else{
					modelMap.put("success", false);
					modelMap.put("errMsg", cartExecution.getStateInfo());
				}
			} catch (Exception e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.toString());
			}
		}else{
			modelMap.put("success", false);
			modelMap.put("errMsg", "请输入车牌号");
		}
		return modelMap;
	}
	/**
	 * 查询所有车辆信息
	 * @return
	 */
	@RequestMapping(value = "/queryCart", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> queryCart(){
		Map<String , Object> modelMap=new HashMap<String, Object>();
		try {
			List<Cart> list = cartService.queryCart();
			if (list != null && list.size() > 0) {
				modelMap.put("success", true);
				modelMap.put("list", list);
			} else {
				modelMap.put("success", false);
			}
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		return modelMap;
	}
}
