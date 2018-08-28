package com.ccunix.icar.base.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseMultiController {

	protected ModelAndView toView(final String url, final Map<String, Object> map) {
		ModelAndView view = new ModelAndView(url);
		return view;
	}

	public void checkSessionAndToken(HttpServletRequest request) {
		HttpSession session = request.getSession();
	}
	
	//组装数据

}
