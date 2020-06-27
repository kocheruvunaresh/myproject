package com.springappone.webdemoone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@GetMapping(value="/hello")
	public String helloWorld() {
		return "Hello world";
	}

}
