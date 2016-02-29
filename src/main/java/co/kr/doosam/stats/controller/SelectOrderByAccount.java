package co.kr.doosam.stats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SelectOrderByAccount {
		
	@RequestMapping(value = "/stats/selectOrderByAccount")
	public String noticeList(){
		
		//주문 번호 별 총 금액
		return "stats/selectOrderByAccount";
	}
	
}
