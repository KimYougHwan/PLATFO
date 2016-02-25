package co.kr.doosam.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManagerCartListController {
	
	@RequestMapping(value = "/cart/managerCartList")
	public String qAndAboardList(){
		//CartList 관리
		return "cart/managerCartList";
	}
}
