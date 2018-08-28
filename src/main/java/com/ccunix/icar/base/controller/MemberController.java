package com.ccunix.icar.base.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.registry.infomodel.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ccunix.icar.base.service.IUserService;

@Controller
@RequestMapping(value = "/member")
public class MemberController extends BaseMultiController {

	@Resource
	private IUserService iUserService;

	@RequestMapping(value = { "/add"}, method = { RequestMethod.POST })
	public void add(HttpServletRequest request, HttpServletResponse response,User user) {
//		System.out.println(user.getName()+"    "+user.getPassword()+"    "+user.getAge());
//		this.iUserService.addUser(user);
	}
	
	@RequestMapping("/queryAll")
	@ResponseBody
	public List queryAll(){
		List ls = iUserService.getAllUser();
		return ls;
	}
	
	@RequestMapping(value = { "/deleteUser"}, method = { RequestMethod.POST })
	public void deleteUser(HttpServletRequest request, HttpServletResponse response,User user){
		
//		this.iUserService.deleteUser(user);
	}

	

//	@RequestMapping(value = { "/{id:\\d+}/query", "/{id:\\d+}/query.html" }, method = { RequestMethod.GET,
//			RequestMethod.POST })
	@RequestMapping("/query")
	public ModelAndView queryMember(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("id") String id) {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(id);
//		User user = iUserService.getUserById(1);
//		if (null != user) {
//			map.put("message", "查询Id=" + id + "的用户名�?:" + user.getName());
//		} else {
//			map.put("message", "没有查询到与Id=" + id + "相关的数�?");
//		}
		return toView("message", map);
	}
	//
	// @RequestMapping(value = { "/{id:\\d+}/delete", "/{id:\\d+}/delete.html"
	// }, method = {
	// RequestMethod.GET, RequestMethod.POST })
	// public ModelAndView deleteMember(HttpServletRequest request,
	// HttpServletResponse response, @PathVariable("id") String id) {
	// Map<String, Object> map = new HashMap<String, Object>();
	// try {
	// this.memberService.delete(id);
	// map.put("message", "删除Id�?" + id + "的用户成�?.");
	// } catch (Exception e) {
	// e.printStackTrace();
	// map.put("message", "删除Id�?" + id + "的用户失�?, " + e.getMessage());
	// }
	// return toView("message", map);
	// }

}