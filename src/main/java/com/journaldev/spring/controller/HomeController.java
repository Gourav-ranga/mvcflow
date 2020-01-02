package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.ws.rs.core.Response;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.model.User;
import com.journaldev.spring.service.StudentService;

@Controller
public class HomeController 
{
	@Autowired
	private StudentService studentservice;
	
	Logger logger = Logger.getLogger(HomeController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model)
	{
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
		BasicConfigurator.configure();
		logger.info("In Controller: home()");
		return "home";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Locale locale, Model model) 
	{
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);
	    logger.info("In Controller: register()");
		return "register";
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public Response user(@Validated User user, Model model)
	{
		System.out.println("User Page Requested");
		model.addAttribute("id",user.getId());
		model.addAttribute("fName",user.getFname());
		model.addAttribute("lName",user.getLname());
		model.addAttribute("age",user.getAge());
		
		
		logger.info("In Controller: user()");
		return studentservice.getStudentDetail(user);
		/* return "user"; */
	}
}
