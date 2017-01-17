package com.smilegate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/test")
	public String test(String name,String age, Model model){
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "test";
	}
}
