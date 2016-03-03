package co.kr.doosam.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.doosam.board.service.BoardService;

@Controller
public class QandAboardUpdateController {
	
	@Autowired
	private BoardService boardService;
	@RequestMapping(value = "/board/qAndAboardUpdate")
	public String qAndAboardUpdate(){
		//Q&A 수정
		boardService.updateBoard();
		return "board/qAndAboardUpdate";
	}
	
}
