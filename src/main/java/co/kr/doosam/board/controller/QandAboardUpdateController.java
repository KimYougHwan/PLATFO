package co.kr.doosam.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QandAboardUpdateController {

	@RequestMapping(value = "/board/qAndAboardUpdate")
	public String qAndAboardUpdate(){
		//Q&A 수정
		return "board/qAndAboardUpdate";
	}
	
}
