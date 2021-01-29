package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoApplicationController {

	@Value("${app.smtp.name}")
	private String smtpName;
	//Expose the API as a web service so that this API will be available over http protocol
	//http://localhost:8080/hello
	//servlet mapping-REST API
	@RequestMapping("/Abhishek_Test1")
	public String hello() {
		return "This is Abhishek : " + smtpName;
	}
}