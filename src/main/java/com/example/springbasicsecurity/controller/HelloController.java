package com.example.springbasicsecurity.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
/*
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class HelloController {

	@GetMapping("hello")
	public String sayHello(){
		return "hello";
	}
	
	
	@GetMapping("hi")
	public String sayHello1(){
		return "hello";
	}
	

	
	@GetMapping("employees")
	public Employee getEmployees(){
		Employee e=new Employee();
		e.setId(1001);
		e.setName("hello");
		return e;
	}

	
	/*	
	@RequestMapping(value="/logmeout", method = RequestMethod.POST)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	if (auth != null){
			new SecurityContextLogoutHandler().logout(request, response, auth);
	}
	return "redirect:/login";
	}
*/

}

