package co.kr.doosam.board.controller;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.doosam.board.service.BoardService;


@Controller
public class NoticeListController {
		
	EntityManager manager;
	
	@Autowired
	private BoardService boardService;
	@RequestMapping(value = "/board/noticeList")
	public String noticeList(String[] args){
		//SpringApplication.run(NoticeListController.class, args);
		boardService.loadBoard();
		return "board/noticeList";
	}

	
}
