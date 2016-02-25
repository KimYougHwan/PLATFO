package co.kr.doosam.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QandAboardListController {
	
	@RequestMapping(value = "/board/qAndAboardList")
	public String qAndAboardList(){
		//Q&A 게시판 리스트
		return "board/qAndAboardList";
	}
	
	@RequestMapping(value = "/board/qAndAboardDelete")
	public String qAndAboardDelete(){
		//Q&A 게시판 삭제
		return "board/qAndAboardDelete";
	}
	
}
