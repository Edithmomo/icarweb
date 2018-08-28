package com.ccunix.icar.register.service;

 

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ccunix.icar.register.dao.UserLoginRegeditDAO;
import com.ccunix.icar.register.domain.UserInfoVO;
@Service
@Transactional
public class UserLoginRegeditServiceImpl implements UserLoginRegeditServiceIface {

	@Resource
	UserLoginRegeditDAO userLoginRegeditDAO;
	
	@Override
	public List doLogin(UserInfoVO infoVO) throws Exception {
		System.out.println("service........1.......");
		return userLoginRegeditDAO.doLogin(infoVO);
	}
	@Override
	public List doguanLogin(UserInfoVO infoVO) throws Exception {
		System.out.println("service........1.......");
		return userLoginRegeditDAO.doguanLogin(infoVO);
	}
	
}
