package co.kr.doosam.part.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.doosam.part.service.PartSearchService;
import co.kr.doosam.part.vo.PartSearchVo;

@Controller
public class SingleSearchController {
	
	@Autowired
	private PartSearchService partSearchService;
	
	@RequestMapping(value="/singleSearch", method={RequestMethod.GET,RequestMethod.POST})
	public String singleSearch(Model model, PartSearchVo partSearchVo){
		
		List<PartSearchVo> list = new ArrayList<PartSearchVo>();
		
		list = partSearchService.selectSingleSearch(partSearchVo);
		
		model.addAllAttributes(list);
		
		return "partSearch/singleSearch";
	}
}
