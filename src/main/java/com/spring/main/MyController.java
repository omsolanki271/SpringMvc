package com.spring.main;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	/* first way */
	//@RequestMapping(value = "/helloPage",method = RequestMethod.GET)
	/* second way */
	@GetMapping("/helloPage")
	public ModelAndView OpenHelloPage()
	{
		System.out.println("openHelloPage() method execute");
		
		ModelAndView mav = new ModelAndView();
		//call to viewResolver with name  
		mav.setViewName("hello");
		return mav;
	}
	
	@GetMapping("/about")
	public String openAboutpage()
	{
		return "about";
	}
	
	@GetMapping("/MyForm")
	public String openmyform()
	{
		return "my-form";
	}
	@PostMapping("/submitForm")
	public String handlMyform(HttpServletRequest request)
	{
		String uname = request.getParameter("username");
		String email = request.getParameter("email");
		String mobileno = request.getParameter("mobile");
		
		System.out.println(uname);
		System.out.println(email);
		System.out.println(mobileno);
		
		return "profile";
	}
}
