package com.mmo.course.home;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller 
public class HomeController {
	
  @RequestMapping(value = { "/", "/index", "/main" }, method = RequestMethod.GET)
  public String homePage(Model model) {
	  System.out.println("in home page");
	  return "index";
  }
  
}



