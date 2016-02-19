package co.kr.doosam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="/", method={RequestMethod.GET,RequestMethod.POST})
	public String test(){
		
		return "login";
	}
	
	@RequestMapping(value="/clientMenu", method={RequestMethod.GET,RequestMethod.POST})
	public String test2(){
		
		return "menu/clientMenu";
	}
	
}
