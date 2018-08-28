package com.ccunix.icar.register.dao;

 

import com.ccunix.icar.register.domain.Userinfo;

public interface Userinfo_dao {
	public void addUser(Userinfo userinfo) throws Exception;
	public Userinfo logonUser(Userinfo userinfo)  throws Exception;
	public Userinfo verification(Userinfo userinfo)  throws Exception;
	public void updatePwd(Userinfo userinfo) throws Exception;
	
}
