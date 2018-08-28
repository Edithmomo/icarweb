package com.ccunix.icar.moneyInfoManager.service;

import java.util.List;

import com.ccunix.icar.employees.domain.Moneyinfo;

public interface MoneyInfoService {
	/**
	 * 查询收费信息
	 * @return
	 */
	List<Moneyinfo> queryMoneyInfo() throws Exception;
	/**
	 * 根据id修改收费信息
	 * @param moneyinfo
	 * @return
	 * @throws Exception
	 */
	int updateMoneyInfoById(Moneyinfo moneyinfo) throws Exception;
}
