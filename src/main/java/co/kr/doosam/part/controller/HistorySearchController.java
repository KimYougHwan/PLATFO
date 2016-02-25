package co.kr.doosam.part.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HistorySearchController {
	@RequestMapping(value="/part/historySearch", method={RequestMethod.GET,RequestMethod.POST})
	public String historySearch(){
		
		return "part/historySearch";
	}
}
