package com.ccunix.icar.employeesmanager.service;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ccunix.icar.employeesmanager.dao.UserCurdDAOIface;
import com.ccunix.icar.employeesmanager.dao.UserInfoDAOIface;
import com.ccunix.icar.employeesmanager.domain.UserCurd;
import com.ccunix.icar.employeesmanager.domain.UserInfo;

@Service
@Transactional 
public class EmployeesManagerServiceImpl implements EmployeesManagerServiceIface{
    
	@Resource
	UserInfoDAOIface userInfoDAOIface;
	
	@Resource
	UserCurdDAOIface userCurdDAOIface;
	
	@Override
	public List queryUserInfoOne(UserInfo info) throws Exception {
		System.out.println("servic...................");
		return userInfoDAOIface.queryUserInfoByUserNumber(info);
	}

	@Override
	public void deleteUserInfo(UserCurd curd, UserInfo info) throws Exception {
		userInfoDAOIface.deleteUserInfo(info);
		userCurdDAOIface.addUserCurd(curd);
	}

	@Override
	public void updateUserInfo(UserCurd curd, UserInfo info) throws Exception {
		userInfoDAOIface.updateUserInfo(info);
		userCurdDAOIface.addUserCurd(curd);
	}

	@Override
	public void addUserInfo(UserInfo info) throws Exception {
        userInfoDAOIface.addUserInfo(info);
	}

}
