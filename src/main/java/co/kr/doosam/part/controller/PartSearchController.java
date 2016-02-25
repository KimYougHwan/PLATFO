package co.kr.doosam.part.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PartSearchController {
	
	@RequestMapping(value="/searchLayer", method={RequestMethod.GET,RequestMethod.POST})
	public String searchLayer(){
		
		return "partSearch/searchLayer";
	}
	
	
	@RequestMapping(value="/partSearch", method={RequestMethod.GET,RequestMethod.POST})
	public String partSearch(){
		
		return "partSearch/partSearch";
	}
}
