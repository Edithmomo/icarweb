package com.ccunix.icar.usermanager.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.icar.usermanager.dao.UserInfoDAOInface;
import com.ccunix.icar.usermanager.domain.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoServiceInface{
	
    @Resource
	UserInfoDAOInface userInfoDAOInface;
	@Override
	public void addUserinfo(UserInfo userInfo) throws Exception {
		System.out.println("访问service............");
		userInfoDAOInface.addUserinfo(userInfo);
		System.out.println("结束service访问。。。。。");
	}
	@Override
	public List queryAllUserInfo() throws Exception {
		List ls = null;
		System.out.println("访问查询service............");
		ls = userInfoDAOInface.queryAllUserInfo();
		System.out.println("结束查询service访问。。。。。");
		System.out.println(ls.size()+"条数据");
		return ls;
	}

}
