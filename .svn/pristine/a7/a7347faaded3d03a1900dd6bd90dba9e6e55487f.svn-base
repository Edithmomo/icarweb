package com.ccunix.icar.register.service;

 

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.register.dao.Userinfo_dao;
import com.ccunix.icar.register.domain.Userinfo;
@Service
@Transactional
public class Userinfo_Service_Impl implements Userinfo_Service_Iface {
	@Resource
	  Userinfo_dao userinfo_dao;
	
	public void addUser(Userinfo userinfo) throws Exception{
		userinfo_dao.addUser(userinfo);
	}
	public void updatePwd(Userinfo userinfo) throws Exception{
		userinfo_dao.updatePwd(userinfo);
	}
	public  Userinfo  logonUser(Userinfo userinfo)
			throws Exception {
		System.out.println("service..............");
		 System.out.println("service........2......");
//		return userinfo_dao.logonUser(userinfo);
		return null;
	}

	@Override
	public Userinfo verification(Userinfo userinfo)
			throws Exception {
		Userinfo userinfo_service=userinfo_dao.verification(userinfo);
		return userinfo_service;
	}
	@Override
	public Userinfo doLogin(Userinfo userinfo) throws Exception {
		System.out.println("service..............");
		 System.out.println("service........2......");
		return null;
	}
}
