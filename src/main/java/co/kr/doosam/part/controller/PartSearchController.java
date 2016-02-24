package co.kr.doosam.part.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.kr.doosam.part.service.PartSearchService;
import co.kr.doosam.part.vo.PartSearchVo;

@Controller
public class PartSearchController {
	
	@Resource(name="partSearchService")
	private PartSearchService partSearchService;
	
	@RequestMapping(value="/singleSearch", method={RequestMethod.GET,RequestMethod.POST})
	public String singleSearch(Model model, PartSearchVo partSearchVo){
		
		List<PartSearchVo> list = new ArrayList<PartSearchVo>();
		
		list = partSearchService.selectSingleSearch(partSearchVo);
		
		model.addAllAttributes(list);
		
		return "partSearch/singleSearch";
	}
	
	@RequestMapping(value="/searchLayer", method={RequestMethod.GET,RequestMethod.POST})
	public String searchLayer(){
		
		return "partSearch/searchLayer";
	}
	
	@RequestMapping(value="/excelUploadSearch", method={RequestMethod.GET,RequestMethod.POST})
	public String excelUploadSearch(){
		
		return "partSearch/excelUploadSearch";
	}
	
	@RequestMapping(value="/historySearch", method={RequestMethod.GET,RequestMethod.POST})
	public String historySearch(){
		
		return "partSearch/historySearch";
	}
	
	@RequestMapping(value="/partSearch", method={RequestMethod.GET,RequestMethod.POST})
	public String partSearch(){
		
		return "partSearch/partSearch";
	}
}
