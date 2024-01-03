package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mainPage {
	@RequestMapping(value="/mainPage")
	public ModelAndView indexPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mainPage");
		return mav;
	}
	@RequestMapping(value="/searchPage")
	public ModelAndView searchPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("searchPage");
		return mav;
	}
	@RequestMapping(value="/korBook")
	public ModelAndView korBook() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("korBook");
		return mav;
	}
	@RequestMapping(value="/engBook")
	public ModelAndView engBook() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("engBook");
		return mav;
	}
	@RequestMapping(value="/mathBook")
	public ModelAndView mathBook() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mathBook");
		return mav;
	}
}
