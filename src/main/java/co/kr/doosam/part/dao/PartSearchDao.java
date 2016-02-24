package co.kr.doosam.part.dao;

import java.util.List;

import co.kr.doosam.part.vo.PartSearchVo;

public interface PartSearchDao {

	public List<PartSearchVo> selectSingleSearch(PartSearchVo partSearchVo);
	
}
