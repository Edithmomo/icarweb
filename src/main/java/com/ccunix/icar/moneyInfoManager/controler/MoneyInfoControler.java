package com.ccunix.icar.moneyInfoManager.controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccunix.icar.employees.domain.Moneyinfo;
import com.ccunix.icar.moneyInfoManager.service.MoneyInfoService;

@RequestMapping("/moneyinfoadmain")
@Controller
public class MoneyInfoControler {
	@Autowired
	private MoneyInfoService moneyInfoService;

	@RequestMapping(value = "/queryMoneyInfo", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> queryMoneyInfo() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		try {
			List<Moneyinfo> list = moneyInfoService.queryMoneyInfo();
			if (list != null && list.size() > 0) {
				modelMap.put("success", true);
				modelMap.put("list", list);
			} else {
				modelMap.put("success", false);
			}
		} catch (Exception e) {
			modelMap.put("success", false);
			modelMap.put("errMsg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/updateMoneyInfo", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updateMoneyInfo(Moneyinfo moneyinfo) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		if (moneyinfo != null) {
			try {
				int effnum = moneyInfoService.updateMoneyInfoById(moneyinfo);
				if (effnum == 1) {
					modelMap.put("success", true);
				} else {
					modelMap.put("success", false);
				}
			} catch (Exception e) {
				modelMap.put("success", false);
				modelMap.put("errMsg", e.getMessage());
			}
		} else {
			modelMap.put("success", false);
			modelMap.put("err", "moneyinfo不能为空");
		}
		return modelMap;
	}
}
