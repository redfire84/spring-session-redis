package com.spring.session.redis.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String home(HttpSession session) {
		session.setAttribute("NAME", "CHANDRASEKAR");
		return "Welcome Home";
	}
	
	@RequestMapping(value = "/repeat", method = RequestMethod.GET)
	public @ResponseBody String repeat(HttpSession session) {
		return (String) session.getAttribute("NAME");
	}
}
