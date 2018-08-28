package com.ccunix.icar.employeesmanager.service;

import java.util.List;

import com.ccunix.icar.employeesmanager.domain.UserCurd;
import com.ccunix.icar.employeesmanager.domain.UserInfo;

public interface EmployeesManagerServiceIface {
	/**
	 * 通过员工工号查询
	 * @param info 员工对象
	 * @return 员工信息
	 * @throws Exception
	 */
	public List queryUserInfoOne(UserInfo info) throws Exception;
	/**
	 * 通过员工id删除员工
	 * @param curd 员工信息修改表
	 * @param info 员工对象
	 * @throws Exception
	 */
	public void deleteUserInfo(UserCurd curd, UserInfo info) throws Exception;
	/**
	 * 通过员工id修改员工信息
	 * @param curd 员工信息修改表
	 * @param info 员工对象
	 * @throws Exception
	 */
	public void updateUserInfo(UserCurd curd, UserInfo info) throws Exception;
	/**
	 * 添加员工
	 * @param  info 员工对象
	 * @throws Exception
	 */
	public void addUserInfo(UserInfo info) throws Exception;
}
