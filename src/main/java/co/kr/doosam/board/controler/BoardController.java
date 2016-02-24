package co.kr.doosam.board.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/qAndAboardList")
	public String qAndAboardList(){
		//Q&A 게시판 리스트
		return "board/qAndAboardList";
	}
	
	@RequestMapping(value = "/qAndAboardWrite")
	public String qAndAboardWrite(){
		//Q&A 게시판 글쓰기
		return "board/qAndAboardWrite";
	}
	
	@RequestMapping(value = "/qAndAboardUpdate")
	public String qAndAboardUpdate(){
		//Q&A 수정
		return "board/qAndAboardUpdate";
	}
	
	@RequestMapping(value = "/qAndAboardDelete")
	public String qAndAboardDelete(){
		//Q&A 게시판 삭제
		return "board/qAndAboardDelete";
	}
	
	@RequestMapping(value = "/noticeList")
	public String noticeList(){
		//관리자 공지사항
		return "board/noticeList";
	}
	
}
