package com.vomtung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class WelcomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	String index(){
		return "welcome";
	}
}
