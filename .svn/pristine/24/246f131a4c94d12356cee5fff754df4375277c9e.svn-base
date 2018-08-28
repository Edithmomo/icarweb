package com.ccunix.icar.carinfo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.icar.carinfo.dao.VipCarInfoDAO;
@Service
public class VipCarInfoService_Impl implements VipCarInfoService_Iface{

	@Resource
	VipCarInfoDAO vipcarInfoDAO;
	@Override
	public List queryVipCarInfo() throws Exception {
		return vipcarInfoDAO.queryVipCarInfo();
	}

}
