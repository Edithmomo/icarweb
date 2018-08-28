package com.ccunix.icar.carinfo.dao;

import java.util.List;

import com.ccunix.icar.carinfo.domain.CarInfoVO;

public interface CarInfoDAO {
	List<CarInfoVO> queryCarInfo() throws Exception;

}
