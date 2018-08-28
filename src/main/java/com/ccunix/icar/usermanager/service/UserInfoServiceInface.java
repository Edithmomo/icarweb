package com.ccunix.icar.usermanager.service;

import java.util.List;

import com.ccunix.icar.usermanager.domain.UserInfo;

public interface UserInfoServiceInface {

	/**
	 * 向数据库中添加员工
	 * @param userInfo 员工信息
	 * @throws Exception
	 */
	public void addUserinfo(UserInfo userInfo) throws Exception;
	/**
	 * 查询用户信息
	 * @return 用户列表
	 * @throws Exception
	 */
    public List queryAllUserInfo()throws Exception;
}
