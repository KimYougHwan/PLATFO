package co.kr.doosam.menu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class providerMenuController {

	@RequestMapping(value = "/menu/providerMenu", method={RequestMethod.GET,RequestMethod.POST})
	public String providerMenu(){
		return "menu/providerMenu";
	}

}
