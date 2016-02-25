package co.kr.doosam.order.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.doosam.order.service.detailListService;

public class detailListController {
	@Resource(name="detailListService")
	private detailListService detailListService;
	
	@RequestMapping(value = "detailOrderList", method={RequestMethod.GET,RequestMethod.POST})
	public String detailOrderList(){
		
		return "order/detailOrderList";
	}

}
