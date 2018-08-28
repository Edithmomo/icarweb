package com.ccunix.icar.cartspacemanager.dao;

import com.ccunix.icar.cartspacemanager.domain.ParkingSpaceVO;

public interface ParkingSpaceDAOInface {
	/**
	 * 查询车位信息
	 * @return 车位信息
	 * @throws Exception
	 */
	public ParkingSpaceVO queryCartSpace() throws Exception;
	
	/**
	 *  修改车位信息
	 * @param cartSpaceVO 车位信息
	 * @throws Exception
	 */         
	public void updateCartSpace(ParkingSpaceVO cartSpaceVO) throws Exception;

}
