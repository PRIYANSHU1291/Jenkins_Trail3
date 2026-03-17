package com.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/* @Controller --> used to handle http request */
@RestController /* combination of controller and response body */
public class Demo {
	
	@RequestMapping("/")
//	@ResponseBody
	public String show() {
		return "Hey Priyanshu";
	}
	
}
