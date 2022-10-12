package com.cg.springbootrestapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/movies")
public class MovieCatalouge {
	
	@GetMapping(value = "/testapi", produces = "text/html")
	public String test() {
		
		String msg = "<font color=red size=10>Shopping Catalouge<font/>";
		return msg;
	}	
}
