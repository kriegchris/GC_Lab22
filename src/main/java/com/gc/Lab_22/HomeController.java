package com.gc.Lab_22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/register")
	public ModelAndView recordInfo() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/summary")
	public ModelAndView formDeets(Person p) {
		ModelAndView mv = new ModelAndView("summary");
		mv.addObject("welcome","Hello " + p.getFirstName() + " " + p.getLastName() + "! Thank you for registering");
		mv.addObject("email", "Email: " + p.getEmail());
		mv.addObject("number", "Phone Number: " + p.getPhoneNumber());
		mv.addObject("branch", "We are looking forward to seeing you next time at our " + p.getBranch() + " branch!");
		if (p.isNewsletter()) {
			mv.addObject("newsletter", "Anticipate receiving our newsletter every day from now " + "<span style='font-size:400%' >" + "until the end of time! :)" + "</span");
		}
		
		return mv;
	}
}
