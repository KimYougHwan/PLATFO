package co.kr.doosam.order.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.doosam.order.service.selectDetailService;

public class selectDetailController {
	@Resource(name="selectDetailService")
	private selectDetailService selectDetailService;
	
	@RequestMapping(value = "selectDetailOrder", method={RequestMethod.GET,RequestMethod.POST})
	public String selectDetailOrder(){
		
		return "order/selectDetailOrder";
	}
}
