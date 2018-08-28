package com.ccunix.icar.cartspacemanager.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ccunix.icar.cartspacemanager.dao.ParkingSpaceDAOInface;
import com.ccunix.icar.cartspacemanager.dao.UpdateCartInfoDAOInface;
import com.ccunix.icar.cartspacemanager.domain.ParkingSpaceVO;
import com.ccunix.icar.cartspacemanager.domain.UpdateCartInfoVO;

@Service
@Transactional
public class ParkingSpaceServiceImpl implements ParkingSpaceServiceInface{

	@Resource
	ParkingSpaceDAOInface parkingSpaceDAOInface;
	
	@Resource
	UpdateCartInfoDAOInface cartInfoDAOInface;
	
	@Override
	public void addUpateCartInfo(ParkingSpaceVO parkingSpaceVO,
			UpdateCartInfoVO updateCartInfoVO) throws Exception {
		parkingSpaceDAOInface.updateCartSpace(parkingSpaceVO);
		cartInfoDAOInface.addUpateCartInfo(updateCartInfoVO);
	}

	@Override
	public void updateParkingSpace(ParkingSpaceVO parkingSpaceVO)
			throws Exception {
		parkingSpaceDAOInface.updateCartSpace(parkingSpaceVO);
	}

	@Override
	public ParkingSpaceVO queryParkingSpace() throws Exception {
		return parkingSpaceDAOInface.queryCartSpace();
	}
	
}
