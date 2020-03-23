package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestDemo {
	@RequestMapping("/")
	public String index(Model model) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		model.addAttribute("list", list);
		return "test";
	}
	
	@ResponseBody
	@RequestMapping("/body")
	public String body() {
		return "body test";
	}
}
