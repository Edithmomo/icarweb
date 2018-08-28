package com.ccunix.icar.cartspacemanager.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.cartspacemanager.domain.ParkingSpaceVO;
import com.ccunix.icar.cartspacemanager.domain.UpdateCartInfoVO;
import com.ccunix.icar.cartspacemanager.service.ParkingSpaceServiceInface;

@Controller
@RequestMapping("/cartspacemanager")
public class ParkingSpaceController {

	@Resource
	ParkingSpaceServiceInface spaceServiceInface;

	@RequestMapping("/queryparkingspace")
	@ResponseBody
	/**
	 * 查询车位信息
	 * @return
	 */
	public ParkingSpaceVO queryParkingSpace() {
		ParkingSpaceVO parkingSpaceVO = null;
		try {
			parkingSpaceVO = spaceServiceInface.queryParkingSpace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return parkingSpaceVO;
	}

	@RequestMapping("/updateuseparkingspace")
	@ResponseBody
	/**
	 * 修改车位使用情况
	 * @param parkingSpaceVO 车位信息
	 * @return 成功  或  失败
	 */
	public boolean updateUseParkingSpace(ParkingSpaceVO parkingSpaceVO) {
		try {
			spaceServiceInface.updateParkingSpace(parkingSpaceVO);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
    
	@RequestMapping("updatetotalparkingspace")
	@ResponseBody
	/**
	 * 修改车位总数
	 * @param parkingSpaceVO 车位信息
	 * @param updateCartInfoVO 修改记录
	 * @return 成功  或  失败
	 */
	public boolean updateTotalParkingSpace(ParkingSpaceVO parkingSpaceVO,
			UpdateCartInfoVO updateCartInfoVO) {
		try {
			spaceServiceInface.addUpateCartInfo(parkingSpaceVO, updateCartInfoVO);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
