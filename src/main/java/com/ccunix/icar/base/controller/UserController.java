package com.ccunix.icar.base.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.xml.registry.infomodel.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.base.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	IUserService iuserservice;
	
    
    @RequestMapping("/userList")
    @ResponseBody
    public List userList(){
        System.out.println("sssssss!!!!");
        return iuserservice.getAllUser();
    }
    
    @RequestMapping("/deleteUser")
    @ResponseBody
    public void deleteUser(User user){
    	
    }
    
    
    
     
   
}
