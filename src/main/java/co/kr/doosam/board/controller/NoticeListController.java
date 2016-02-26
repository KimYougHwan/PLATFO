package co.kr.doosam.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.kr.doosam.board.dao.NoticeDao;
import co.kr.doosam.board.service.BoardService;


@Controller
public class NoticeListController {
		
	@Autowired
	BoardService boardService;
	@RequestMapping(value = "/board/noticeList")
	public ModelAndView noticeList(){
		
		NoticeDao nDto = new NoticeDao();
		List<NoticeDao> noticeList = boardService.noticeList();
		//관리자 공지사항
		return new ModelAndView("board/noticeList", "noticeList", noticeList);
	}
	
}
