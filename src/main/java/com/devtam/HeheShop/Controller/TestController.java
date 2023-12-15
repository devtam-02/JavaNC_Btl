package com.devtam.HeheShop.Controller;

import javax.servlet.annotation.WebServlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String test(ModelMap map) {
		map.addAttribute("msg","anh Tâm đẹp trai vcđ");
		return "index2";
	}
}
