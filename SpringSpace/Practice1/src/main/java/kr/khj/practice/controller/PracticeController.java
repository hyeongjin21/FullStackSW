package kr.khj.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PracticeController {

	@GetMapping("/")
	public String practiceMain() {
		return "PracticeDataView";
	}
	
	@GetMapping("/inputData")
	public String goInputData() {
		return "PracticeInputData";
	}
	
	@PostMapping("/setUser")
	public void setUser() {
		
	}
	
}
