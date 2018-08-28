package com.ccunix.icar.employeesmanager.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.employeesmanager.domain.UserCurd;
import com.ccunix.icar.employeesmanager.domain.UserInfo;
import com.ccunix.icar.employeesmanager.service.EmployeesManagerServiceIface;

@Controller
@RequestMapping("/employeesmanager")
public class EmployeesManagerController {

	@Resource
	EmployeesManagerServiceIface serviceIface;

	@RequestMapping("/queryByUserNumber")
	@ResponseBody
	public List queryUserInfoByUserNumber(UserInfo info) {
		List ls = null;
		try {
			System.out.println("name="+info.getUser_name());
			ls = serviceIface.queryUserInfoOne(info);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}

	@RequestMapping("/deleteUserInfo")
	@ResponseBody
	public boolean deleteUserInfo(UserCurd curd, UserInfo info) {
		boolean f = false;
		try {
			System.out.println("删除员工。。。。。。。。。。。。。");
			String[] user_id_str = info.getUser_number().split(",");
			for (String u : user_id_str) {
				System.out.println("u="+u);
				int user_id = Integer.parseInt(u);
				curd.setUser_id(user_id);
				info.setUser_id(user_id);
				curd.setCurd_type("删除");
				serviceIface.deleteUserInfo(curd, info);
			}
			f = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("结束删除员工。。。。。。。。。。。。。");
		return f;
	}

	@RequestMapping("/updateUserInfo")
	@ResponseBody
	public boolean updateUserInfo(UserCurd curd, UserInfo info) {
		boolean f = false;
		try {
			curd.setCurd_type("修改");
			serviceIface.updateUserInfo(curd, info);
			f = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	@RequestMapping("/addUserInfo")
	@ResponseBody
	public boolean addUserInfo(UserInfo info) {
		boolean f = false;
		try {
			serviceIface.addUserInfo(info);
			f = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}
}
