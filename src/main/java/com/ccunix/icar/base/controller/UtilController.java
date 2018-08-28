package com.ccunix.icar.base.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.base.util.TokenUtil;

@Controller
@RequestMapping("/UtilController")
public class UtilController extends BaseMultiController {
	
	@Resource
	TokenUtil tokenUtil;
	//token获取
	@RequestMapping("/getToken")
	@ResponseBody
	public String getToken(HttpServletRequest request, HttpServletResponse response){
		return tokenUtil.getTokenString(request.getSession());
	}
	
	@RequestMapping("/getSession")
	@ResponseBody
	public String getSession(HttpServletRequest request, HttpServletResponse response){
		return request.getSession().getId();
	}
	
	

}
