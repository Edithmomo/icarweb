package com.ccunix.icar.register.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.register.domain.UserInfoVO;
import com.ccunix.icar.register.service.UserLoginRegeditServiceIface;

@Controller
@RequestMapping("/userloginregedit")
public class UserLoginRegeditController {
	
	@Resource
	UserLoginRegeditServiceIface userLoginRegeditServiceIface;
	
	@RequestMapping("/dologin")
	@ResponseBody
	public List doLogin(UserInfoVO infoVO){
		List ls = null;
		System.out.println("controller.......1..............");
		try {
			System.out.println("controller.......2..............");
			ls = userLoginRegeditServiceIface.doLogin(infoVO);
			System.out.println("controller........3.............");
		} catch (Exception e) {
			System.out.println("controller........4.............");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("controller........5.............");
		return ls;
	}
	@RequestMapping("/doguanlogin")
	@ResponseBody
	public List doguanLogin(UserInfoVO infoVO){
		List ls = null;
		System.out.println("controller.......1..............");
		try {
			System.out.println("controller.......2..............");
			ls = userLoginRegeditServiceIface.doguanLogin(infoVO);
			System.out.println("controller........3.............");
		} catch (Exception e) {
			System.out.println("controller........4.............");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("controller........5.............");
		return ls;
	}

}
