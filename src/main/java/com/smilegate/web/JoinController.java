package com.smilegate.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class JoinController {
	private List<User> users = new ArrayList<>();
	@PostMapping("/user/create")
	public String create (User user){
		users.add(user);
		System.out.println("users size : " + users.size());
		System.out.println("users : " + users);
		
		//model.addAttribute("", name);
		//model.addAttribute("age", age);
		return "redirect:/";
	}
	@GetMapping("/user/list")
	public String list(Model model){
		model.addAttribute("users",users);
		//for(int i=0;i<users.size();i++){
		//}
		return "/user/list";
	}
}
