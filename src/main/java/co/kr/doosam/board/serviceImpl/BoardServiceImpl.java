package co.kr.doosam.board.serviceImpl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.dataRepository.HmcBoardRepository;
import co.kr.doosam.board.service.BoardService;
import co.kr.doosam.data.HmcBoard;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	@Resource
	private HmcBoardRepository hmcBoardRepository;
	@Override
	public ArrayList<HmcBoard> selectNoticeBoardList() {
		// TODO Auto-generated method stub
		String boardType = "Notice";
		ArrayList<HmcBoard> noticeList = new ArrayList<HmcBoard>();
		
		//boardType값의 count값을 구함
		Object boardCnt = hmcBoardRepository.countByBoardType(boardType);
		System.out.println(boardCnt);
		
		//boardCnt의 값이 1개 이상일경우 게시글 정보를 읽어 들인다.
		if(Integer.parseInt(boardCnt.toString()) > 0){
			noticeList = (ArrayList) hmcBoardRepository.findAllByBoardType(boardType);
		}
		return noticeList;
	}


}
