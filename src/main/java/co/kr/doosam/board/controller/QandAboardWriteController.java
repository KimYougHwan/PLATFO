package co.kr.doosam.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.doosam.board.service.BoardService;

@Controller
public class QandAboardWriteController {

	@Autowired
	private BoardService boardService;
	@RequestMapping(value = "/board/qAndAboardWrite")
	public String qAndAboardWrite(){
		//Q&A 게시판 글쓰기
		boardService.saveBoard();
		return "board/qAndAboardWrite";
	}
	
}
