package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.jpa.TestRepo;
import com.example.demo.vo.TestVo;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Test {
	
	@Autowired
	TestRepo testRepo;
	
	
	
	@RequestMapping(value="home")
	public ModelAndView home() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("home");
		return mav;
	}
	@RequestMapping(value="insertTest")
	public ModelAndView insert(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String id = request.getParameter("testId");
		TestVo vo = new TestVo();
		vo.setId(id);
		testRepo.save(vo);
		mav.addObject("result", vo);
		mav.setViewName("showResult");
		return mav;
	}
}
