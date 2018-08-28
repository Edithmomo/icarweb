package com.ccunix.icar.register.dao;

import java.util.List;

import com.ccunix.icar.register.domain.UserInfoVO;

public interface UserLoginRegeditDAO {

	public List doLogin(UserInfoVO infoVO) throws Exception;
	public List doguanLogin(UserInfoVO infoVO) throws Exception;
	
}
