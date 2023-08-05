package com.phase5.springlogelk;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.ELKProject.demo.user.UserApplication;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@Slf4j
public class Controller {
	Logger log = LoggerFactory.getLogger(Controller.class);

	@GetMapping("/")
	public String HomeRoute() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome home Page " + localDateTime);
		return "Welcome! This is the Home Page.";
	}
	
	@GetMapping("/user")
	public String UserRoute() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome home Page " + localDateTime);
		return "Welcome to your Personal Info Page!";
	}
	
	@GetMapping("/cart")
	public String CartRoute() {
		LocalDateTime localDateTime = LocalDateTime.now();
		 log.info("Welcome home Page " + localDateTime);
		return "This is your Shopping Cart Page.";
	}
	
	@GetMapping("/product")
	public String ProductRoute() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome home Page " + localDateTime);
		return "This is the Display Products Page.";
	}
	
	@GetMapping("/error")
	public String ErrorRoute() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("Welcome home Page " + localDateTime);
		return "Some error has occured. Please try again!";
	}
}
