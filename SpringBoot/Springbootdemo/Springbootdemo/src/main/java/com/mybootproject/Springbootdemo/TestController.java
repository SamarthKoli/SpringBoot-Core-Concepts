package com.mybootproject.Springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {

	
	@RequestMapping("/test")
	public String TestHandler(Model model) {
		model.addAttribute("name","Samarth Koli");
		model.addAttribute("age", 12);
		
		return "This is Test Handler";
	}
}
