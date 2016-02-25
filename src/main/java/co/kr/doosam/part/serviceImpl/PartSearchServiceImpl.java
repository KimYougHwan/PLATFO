package co.kr.doosam.part.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.kr.doosam.part.dao.PartSearchDao;
import co.kr.doosam.part.service.PartSearchService;
import co.kr.doosam.part.vo.PartSearchVo;

@Service("partSearchService")
public class PartSearchServiceImpl implements PartSearchService {
	
	@Resource(name="partSearchDao")
	private PartSearchDao partSearchDao;
	
	public List<PartSearchVo> selectSingleSearch(PartSearchVo partSearchVo) {
		return partSearchDao.selectSingleSearch(partSearchVo);
	};
}