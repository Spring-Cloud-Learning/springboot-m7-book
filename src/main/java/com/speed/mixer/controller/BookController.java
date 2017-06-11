package com.speed.mixer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	private static Logger log = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping(value = "/available")
	public String available() {
		log.info("Reached BookController-available");
		return "Spring in Action";
	}

	@RequestMapping(value = "/checked-out")
	public String checkedOut() {
		log.info("Reached BookController-checked-out");
		return "Spring Boot in Action";
	}

}
