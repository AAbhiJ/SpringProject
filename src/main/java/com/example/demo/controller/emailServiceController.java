package com.example.demo.controller;


import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Emailer.IEmailerService;

@RestController
public class emailServiceController {
//	iEmailerService emailService = new DummyEmailSender();
	
	//Dont creaet any obj with specific type let spring create it 
	//@Autowired      //at instance variable
	IEmailerService emailService;
	
	public IEmailerService getEmailService() {
		return emailService;
	}

	/*
	@Autowired
	public void setEmailService(iEmailerService emailService) {
		this.emailService = emailService;
	}
	*/

	
	@Autowired //using constructor
	public emailServiceController(IEmailerService abc) {
		this.emailService = abc;
	}
	
	
	@RequestMapping("/sendMail")
	public String email() throws MessagingException {
		emailService.sendEmail("AdiBhosale@adi.com", "Trying to send", "Ghe Mail");
		
		return "Mail Sent";
	}
}
