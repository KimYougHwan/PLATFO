package co.kr.doosam.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.doosam.board.service.BoardService;
import co.kr.doosam.board.vo.BoardListVo;

@Controller
public class NoticeListController {
		
	@RequestMapping(value = "/board/noticeList")
	public String noticeList(){
		
		
		//관리자 공지사항
		return "board/noticeList";
	}
	
}
