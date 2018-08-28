package com.ccunix.icar.carinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.carinfo.service.CarInfoService_Iface;


@Controller
@RequestMapping("/carinfo")
public class CarInfoController {
	@Resource
	CarInfoService_Iface carInfoService_Iface;
	
	@RequestMapping("/querycarinfo")
	@ResponseBody
	public List queryCarInfo(){
		try {
			return carInfoService_Iface.querCarInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
