package co.kr.doosam.orderstatus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class selectOrderDeadlineController {
	@RequestMapping(value = "/orderstatus/selectOrderDeadline", method={RequestMethod.GET,RequestMethod.POST})
	public String main(){
		return "orderstatus/selectOrderDeadline";
	}
}
