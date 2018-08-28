package com.ccunix.icar.employees.controler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.employees.domain.Cart;
import com.ccunix.icar.employees.domain.VipCart;
import com.ccunix.icar.employees.dto.VipCartExecution;
import com.ccunix.icar.employees.enums.VipCartEnum;
import com.ccunix.icar.employees.service.VipCartService;

@RequestMapping("/vipcartadmin")
@Controller
public class VipCartControler {
	@Autowired
	private VipCartService vipCartService;
	@RequestMapping(value = "/addVipCart", method = RequestMethod.POST)
	@ResponseBody
	private Map<String, Object> addVipCart(VipCart vipCart){
		Map<String, Object> modelMap=new HashMap<String, Object>();
		if(vipCart!=null && vipCart.getCartNumber()!=null){
			try {
				VipCartExecution vipCartExecution=vipCartService.addVipCart(vipCart);
				if(vipCartExecution.getState()==VipCartEnum.SUCCESS.getState()){
					modelMap.put("success", true);
				}else{
					modelMap.put("success", false);
					modelMap.put("errMsg", vipCartExecution.getStateInfo());
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
	@RequestMapping(value = "/renewal", method = RequestMethod.GET)
	@ResponseBody
	private Map<String, Object> renewal(VipCart vipCart){
		Map<String, Object> modelMap=new HashMap<String, Object>();
		if(vipCart!=null && vipCart.getCartNumber()!=null && vipCart.getTime()!=0){
			int renewalDays=vipCart.getTime();
			Cart cart=new Cart();
			cart.setCartNumber(vipCart.getCartNumber());
			try {
				VipCartExecution vipCartExecution=vipCartService.renewal(cart, renewalDays);
				if(vipCartExecution.getState()==VipCartEnum.SUCCESS.getState()){
					modelMap.put("success", true);
				}else{
					modelMap.put("success", false);
					modelMap.put("errMsg", vipCartExecution.getStateInfo());
				}
			} catch (Exception e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.toString());
			}
			
		}else{
			modelMap.put("success", false);
			modelMap.put("errMsg", "信息不全");
		}
		return modelMap;
	}
}
