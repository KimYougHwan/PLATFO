package co.kr.doosam.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.SqlResultSetMapping;

import org.hibernate.internal.SQLQueryImpl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import co.kr.doosam.board.dto.BoardDto;
import co.kr.doosam.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	@Override
	public void noticeList(BoardDto bDto) {
		// TODO Auto-generated method stub
		
		String sql="";
		//return jdbcTemplate.execute(sql);

	}
}
