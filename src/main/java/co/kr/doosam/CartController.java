package co.kr.doosam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartController {
	
	@RequestMapping(value = "/managerCartList")
	public String qAndAboardList(){
		//CartList 관리
		return "cart/managerCartList";
	}
	
	@RequestMapping(value = "/selectDetailCart")
	public String selectDetailCart(){
		//CartList 관리
		return "cart/selectDetailCart";
	}
	
	@RequestMapping(value = "/selectDetailCart2")
	public String selectDetailCart2(){
		//CartList 관리
		return "cart/selectDetailCart2";
	}
	
	@RequestMapping(value = "/selectAdvancePaymentList")
	public String selectAdvancePaymentList(){
		//CartList 관리
		return "cart/selectAdvancePaymentList";
	}

}
