package com.ccunix.icar.register.controller;

 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.register.domain.Userinfo;
import com.ccunix.icar.register.service.Userinfo_Service_Iface;

@Controller
@RequestMapping("/register")
public class RegisterController {

	Userinfo_Service_Iface userinfo_Service;

	@RequestMapping("/adduser")
	public void addUser(Userinfo userinfo) {
		try {
			userinfo_Service.addUser(userinfo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("/updatePwd")
	public void updatePwd(Userinfo userinfo) {
		try {
			userinfo_Service.updatePwd(userinfo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping("/logonUser")
	@ResponseBody
	public Userinfo doLogin(Userinfo info){
		Userinfo userinfo = null;
		System.out.println("controller.....0..........");
		try {
			System.out.println("controller...1............");
			userinfo = userinfo_Service.doLogin(userinfo);
			System.out.println("controller.....2..........");
		} catch (Exception e) {
			System.out.println("controller.....3..........");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("controller.....4..........");
		return userinfo;
	}

	@RequestMapping("/verification ")
	@ResponseBody
	public Userinfo verification(Userinfo userinfo) {
		Userinfo userinfo2 = null;
		try {
			userinfo2 = userinfo_Service.verification(userinfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userinfo2;
	}

}
