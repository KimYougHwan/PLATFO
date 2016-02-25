package co.kr.doosam.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class selectDetailController {
	@RequestMapping(value = "selectDetailOrder", method={RequestMethod.GET,RequestMethod.POST})
	public String selectDetailOrder(){
		
		return "order/selectDetailOrder";
	}
}
