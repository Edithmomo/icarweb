package com.ccunix.icar.moneyInfoManager.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccunix.icar.employees.domain.Moneyinfo;
import com.ccunix.icar.moneyInfoManager.dao.MoneyInfoDao;
import com.ccunix.icar.moneyInfoManager.service.MoneyInfoService;
@Service
public class MoneyInfoServiceImpl implements MoneyInfoService {
	@Autowired
	private MoneyInfoDao moneyInfoDao;
	
	
	@Override
	public List<Moneyinfo> queryMoneyInfo() throws Exception{
		List<Moneyinfo> list=new ArrayList<Moneyinfo>();
		try {
			list=moneyInfoDao.queryMoneyInfo();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return list;
	}
	
	@Override
	public int updateMoneyInfoById(Moneyinfo moneyinfo) throws Exception {
		int effnum = 0;
		if(moneyinfo!=null){
			try {
				int num=moneyInfoDao.updateMoneyInfoById(moneyinfo);
				if(num<=0){
					effnum=0;
				}else{
					effnum=1;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return effnum;
	}
	
}
