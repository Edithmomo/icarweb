package com.ccunix.icar.carinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.carinfo.service.VipCarInfoService_Iface;
@Controller
@RequestMapping("/vipcarinfo")
public class VipCarInfoController {
	@Resource
	VipCarInfoService_Iface vipcarInfoService_Iface;
	
	@RequestMapping("/queryvipcarinfo")
	@ResponseBody
	public List queryVipCarInfo(){
		try {
			return vipcarInfoService_Iface.queryVipCarInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
