package co.kr.doosam.login.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.doosam.login.service.LoginService;


@Controller
public class LoginController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/", method={RequestMethod.GET,RequestMethod.POST})
	public String loginView(){
		
		log.debug(" [ {} ]" ,"/ 호출" );;
		
		
		
		return "login";
	}

}
