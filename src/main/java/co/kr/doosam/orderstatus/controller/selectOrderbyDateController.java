package co.kr.doosam.orderstatus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class selectOrderbyDateController {

	@RequestMapping(value = "/orderstatus/selectOrderbyDate", method={RequestMethod.GET,RequestMethod.POST})
	public String main(){
		return "orderstatus/selectOrderbyDate";
	}

}
