package co.kr.doosam.part.service;

import java.util.List;

import co.kr.doosam.part.vo.PartSearchVo;

public interface PartSearchService {

	public List<PartSearchVo> selectSingleSearch(PartSearchVo partSearchVo);
}
