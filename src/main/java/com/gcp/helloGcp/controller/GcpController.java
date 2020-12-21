package com.gcp.helloGcp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gcp")
public class GcpController {
	
	@GetMapping("/test")
	public String testApi(){		
		return "Welcome to GCP...!";
	}
}
