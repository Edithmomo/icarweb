package com.ccunix.icar.usermanager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.usermanager.domain.UserInfo;
import com.ccunix.icar.usermanager.service.UserInfoServiceInface;

@Controller
@RequestMapping("/usermanager")
public class UserManagerController {

	@Resource
	UserInfoServiceInface userInfoServiceInface;

	@RequestMapping("/adduser")
	public void addUser(UserInfo userInfo) {
		UserInfo info = new UserInfo(4, 2, "20152232", "123456", "张三","13235452435", "524245201808056354");
		try {
			System.out.println("访问controller。。。。。");
			userInfoServiceInface.addUserinfo(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束controller访问。。。。。");
	}
	
	@RequestMapping("/queryAllUserInfo")
	@ResponseBody
	public List queryAllUserInfo(){
		List ls = null;
		try {
			System.out.println("访问查询controller。。。。。");
			ls = userInfoServiceInface.queryAllUserInfo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束查询controller访问。。。。。");
		return ls;
	}
}
