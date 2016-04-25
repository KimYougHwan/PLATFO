package co.kr.doosam.board.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import co.kr.doosam.board.service.BoardService;
import co.kr.doosam.data.HmcBoard;


@Controller
public class NoticeListController {
		
	EntityManager manager;
	ArrayList<HmcBoard> boardList;
	@Resource
	private BoardService boardService;
	@RequestMapping(value = "/board/noticeList")
	public String noticeList(Model model, String[] args){
		
		int totalPage = 17;
		int currntPage = 15;
		int pageNum = 4; //현재 페이지 앞뒤로 리스트에 보여줄 갯수
		int startPage = currntPage - pageNum;  //보여질 페이지 num 시작
		int endPage = currntPage + pageNum;  //보여질 페이지 num 끝
		int test = 9; //페이지 넘버리스트
		boardList = new ArrayList<HmcBoard>();		
		boardList = boardService.selectNoticeBoardList();
		
		/*
		if(totalPage > 0){
			if(totalPage < 10){
				for(int i = 0; i < totalPage; i++){
					System.out.println("1");
				}
			}
			//마지막 페이지가 
			// 1  2  3  4  5  6  7  8  9 
			//16 17 18 19 20 21 22 23 24
		   else if(totalPage > test && totalPage > endPage ){
				//가운데찍힐 페이지
				for(int i = startPage; i <= endPage; i++){
					System.out.println(i);
					//test.set(0, i+1);
				}
				System.out.println("2");
			}
		   else if(totalPage > test && totalPage < endPage ){
				//가운데찍힐 페이지
				for(int i = totalPage - test; i <= totalPage; i++){
					System.out.println(i);
					//test.set(0, i+1);
				}
				System.out.println("3");
			}
		}
		*/
		model.addAttribute("noticeList",boardList);
		return "board/noticeList";
	}

	
}
