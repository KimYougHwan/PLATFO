package co.kr.doosam.stat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SelectMonthOrderMissCountController {

	@RequestMapping(value="/stat/selectMonthOrderMissCount", method={RequestMethod.GET,RequestMethod.POST})
	public String selectMonthOrderMissCount(){
		
		return "stat/selectMonthOrderMissCount";
	}
}
