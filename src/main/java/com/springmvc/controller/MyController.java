package com.springmvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.bean.User;

@Controller
public class MyController {

	@GetMapping("/")
	public String home() {
	    return "index";
	}
	
	/* first way */
	// @RequestMapping(value = "/helloPage",method = RequestMethod.GET)
	/* second way */
	@GetMapping("/helloPage")
	public ModelAndView OpenHelloPage() {
		System.out.println("openHelloPage() method execute");

		ModelAndView mav = new ModelAndView();
		// call to viewResolver with name
		mav.setViewName("hello");
		return mav;
	}

	@GetMapping("/about")
	public String openAboutpage() {
		return "about";
	}

	@GetMapping("/MyForm")
	public String openmyform() {
		return "my-form";
	}

/* First Way to pass data (Not use in company- only learning purpose) */

	/*
	 * @PostMapping("/submitForm") public String handleMyform(HttpServletRequest
	 * request) { String uname = request.getParameter("username"); String email =
	 * request.getParameter("email"); String mobileno =
	 * request.getParameter("mobile");
	 * 
	 * System.out.println(uname); System.out.println(email);
	 * System.out.println(mobileno);
	 * 
	 * return "profile"; }
	 */

/* Second Way to pass data */
	
	/*
	 * @PostMapping("/submitForm") public String
	 * handleMyform(@RequestParam("username") String uname,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("mobile") String mobileno, Model model )
	 * 
	 * { System.out.println(uname); System.out.println(email);
	 * System.out.println(mobileno);
	 * 
	 * model.addAttribute("model_uname",uname);
	 * model.addAttribute("model_email",email);
	 * model.addAttribute("model_mobile",mobileno);
	 * 
	 * return "profile"; }
	 */
	
	
/* Thired Way to pass data */
/* (very tuff for every attribute pase so pass Object in other page) */

	/*
	 * @PostMapping("/submitForm") public String
	 * handleMyform(@RequestParam("username") String uname,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("mobile") String mobileno, Model model )
	 * 
	 * {
	 * 
	 * 
	 * User user = new User(); user.setUname(uname); user.setEmail(email);
	 * user.setMobileno(mobileno);
	 * 
	 * model.addAttribute("model_user",user);
	 * 
	 * System.out.println(user.getUname()); System.out.println(user.getEmail());
	 * System.out.println(user.getMobileno());
	 * 
	 * 
	 * return "profile"; }
	 */
	
	
/* Fourth Way to pass data */
//use modelattribute and direct pass User class
//Note: <input> -> name attribute match with User class variable 
	
	@PostMapping("/submitForm")
	public String handleMyform(@ModelAttribute User user)
	{
		
		System.out.println(user.getUname());
		System.out.println(user.getEmail());
		System.out.println(user.getMobileno());
		
		
		return "profile";
	}
}
