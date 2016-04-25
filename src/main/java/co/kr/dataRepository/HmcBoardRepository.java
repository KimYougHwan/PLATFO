package co.kr.dataRepository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import co.kr.doosam.data.HmcBoard;

public interface HmcBoardRepository extends JpaRepository<HmcBoard, String>{
	public long countByBoardType(String boardType);
	public ArrayList<HmcBoard> findAllByBoardType(String boardType);

}
