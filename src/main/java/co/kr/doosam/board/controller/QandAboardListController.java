package co.kr.doosam.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.doosam.board.service.BoardService;

@Controller
public class QandAboardListController {
	
	@Autowired
	private BoardService boardService;
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
