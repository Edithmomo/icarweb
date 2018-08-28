package com.ccunix.icar.employeesmanager.dao;

import com.ccunix.icar.employeesmanager.domain.UserCurd;
import com.ccunix.icar.employeesmanager.domain.UserInfo;

public interface UserCurdDAOIface {
	/**
	 * 添加修改员工信息记录
	 * @param curd 员工信息修改记录
	 * @return 成功  或 失败
	 * @throws Exception
	 */
	public void addUserCurd(UserCurd curd) throws Exception;
}
