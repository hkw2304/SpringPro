package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ResultBook {
	@RequestMapping(value="/resultBook")
	public ModelAndView korResult(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String result = request.getParameter("kor1");
		System.out.println(result);
		mav.addObject("result", result);
		mav.setViewName("resultKor");
		return mav;
	}
}
