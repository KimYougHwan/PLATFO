package co.kr.doosam.part.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PartSearchController {
	
	@RequestMapping(value="/part/searchLayer", method={RequestMethod.GET,RequestMethod.POST})
	public String searchLayer(){
		
		return "part/searchLayer";
	}
	
	
	@RequestMapping(value="/part/partSearch", method={RequestMethod.GET,RequestMethod.POST})
	public String partSearch(){
		
		return "part/partSearch";
	}
}
