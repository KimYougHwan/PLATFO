package co.kr.doosam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderContoller{
	
	@RequestMapping(value = "detailOrderList", method={RequestMethod.GET,RequestMethod.POST})
	public String detailOrderList(){
		
		return "order/detailOrderList";
	}
	
	@RequestMapping(value = "selectDetailOrder", method={RequestMethod.GET,RequestMethod.POST})
	public String selectDetailOrder(){
		
		return "order/selectDetailOrder";
	}
}
