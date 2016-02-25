package co.kr.doosam.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class detailListController {
	@RequestMapping(value = "order/detailOrderList", method={RequestMethod.GET,RequestMethod.POST})
	public String detailOrderList(){
		return "order/detailOrderList";
	}

}
