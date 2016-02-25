package co.kr.doosam.part.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExcelUploadSearchController {
	@RequestMapping(value="/part/excelUploadSearch", method={RequestMethod.GET,RequestMethod.POST})
	public String excelUploadSearch(){
		
		return "part/excelUploadSearch";
	}
}
