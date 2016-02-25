package co.kr.doosam.board.serviceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.stereotype.Service;
import java.sql.PreparedStatement;
import co.kr.doosam.board.dto.NoticeDto;
import co.kr.doosam.board.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	// JdbcTemplate jdbcTemplate = new JdbcTemplate();
	private DataSource dataSource;

	@Override
	public void noticeList(NoticeDto nDto) {
		// TODO Auto-generated method stub

		String sql = "SELECT * FROM ";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	
	
}
