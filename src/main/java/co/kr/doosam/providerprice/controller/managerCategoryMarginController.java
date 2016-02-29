package co.kr.doosam.providerprice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class managerCategoryMarginController {

	@RequestMapping(value = "/providerprice/managerCategoryMargin", method={RequestMethod.GET,RequestMethod.POST})
	public String main(){
		return "providerprice/managerCategoryMargin";
	}

}
