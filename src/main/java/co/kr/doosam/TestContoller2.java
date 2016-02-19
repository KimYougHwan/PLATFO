package co.kr.doosam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller2 {
	
	@RequestMapping(value = "loginChk")
	public String loginChk(){
		
		return "1111";
	}
}
