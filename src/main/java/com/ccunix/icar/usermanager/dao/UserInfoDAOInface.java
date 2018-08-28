package com.ccunix.icar.usermanager.dao;

import java.util.List;

import com.ccunix.icar.usermanager.domain.UserInfo;

public interface UserInfoDAOInface {
	/**
	 * 添加用户到数据库中
	 * @param info 用户信息
	 * @throws Exception
	 */
	public void addUserinfo(UserInfo info) throws Exception;
	/**
	 * 查询用户信息
	 * @return 用户列表
	 * @throws Exception
	 */
    public List queryAllUserInfo()throws Exception;
}
