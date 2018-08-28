package com.ccunix.icar.carinfo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ccunix.icar.carinfo.dao.CarInfoDAO;


@Service
public class CarInfoService_Impl implements CarInfoService_Iface{
	@Resource
	CarInfoDAO carInfoDAO;

	@Override
	public List querCarInfo() throws Exception {
		// TODO Auto-generated method stub
		return carInfoDAO.queryCarInfo();
	}

}
