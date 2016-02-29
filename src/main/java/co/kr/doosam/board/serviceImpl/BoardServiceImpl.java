package co.kr.doosam.board.serviceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.stereotype.Service;
import java.sql.PreparedStatement;

import co.kr.doosam.board.dao.NoticeDao;
import co.kr.doosam.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	// JdbcTemplate jdbcTemplate = new JdbcTemplate();
	private DataSource dataSource;

	@Override
	public List<NoticeDao> noticeList() {
		// TODO Auto-generated method stub

	}
	
	
	
}
