package co.kr.doosam.part.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.kr.doosam.part.vo.PartSearchVo;

@Repository("partSearchDao")
public class PartSearchDaoImpl implements PartSearchDao{
	
	public List<PartSearchVo> selectSingleSearch(PartSearchVo partSearchVo) {
		//select query
		return null;
	};
}
