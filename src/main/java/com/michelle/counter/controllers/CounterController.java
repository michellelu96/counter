package com.michelle.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CounterController {
	
	@GetMapping("/")
    public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount =(Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
			
		}
		return "index.jsp";
	}
	
	@GetMapping("/counter")
	public String showCount(HttpSession session) {

		return "ShowCount.jsp";
	}
}
