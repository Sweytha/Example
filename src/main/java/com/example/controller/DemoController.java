package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
    Logger logger=LoggerFactory.getLogger(this.getClass());
    @GetMapping("/helloWorld")
	public String hello(){
    	
    	String response="Hello world";
    	logger.info("Response from the application logs {}",response);
		
		return "Output is executed and its working now";
	
		
	}
	
	
	

}
