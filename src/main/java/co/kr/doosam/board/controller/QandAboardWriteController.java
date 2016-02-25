package co.kr.doosam.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QandAboardWriteController {
	
	@RequestMapping(value = "/board/qAndAboardWrite")
	public String qAndAboardWrite(){
		//Q&A 게시판 글쓰기
		return "board/qAndAboardWrite";
	}
	
}
