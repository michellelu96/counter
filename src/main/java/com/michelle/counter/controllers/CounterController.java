package com.michelle.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller
public class CounterController {
	public String index(HttpSession session) {
		return "index.jsp";
	}
}
