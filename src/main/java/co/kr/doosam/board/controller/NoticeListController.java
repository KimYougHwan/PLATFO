package co.kr.doosam.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.doosam.board.dto.NoticeDto;
import co.kr.doosam.board.service.BoardService;

@Controller
public class NoticeListController {
		
	@RequestMapping(value = "/board/noticeList")
	public String noticeList(){
		

		
		//관리자 공지사항
		return "board/noticeList";
	}
	
}
