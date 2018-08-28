package com.ccunix.icar.base.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.base.domain.PageModel;
import com.ccunix.icar.base.service.PageServiceIface;

@Controller
@RequestMapping("/PageController")
public class PageController extends BaseMultiController {
	
	@Resource
	PageServiceIface pageServiceIface;
	
	@RequestMapping(value = { "/queryData"}, method = { RequestMethod.POST })
	public List queryData(HttpRequest request,HttpServletResponse response){
		return null;
	}
	
	@RequestMapping(value = { "/getPageModel"}, method = { RequestMethod.POST })
	@ResponseBody
	public PageModel getPageModel(HttpServletRequest request,HttpServletResponse response){
		return pageServiceIface.getPageModel(request);
	}

}
