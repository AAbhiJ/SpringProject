package com.example.demo.Emailer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

/*This class will be use to configure the beans of DummyEmailSender.java and SMTPEmailSender.java as we 
 don't have source of these class but we want use them as a Spring bean*/

@Configuration
public class mailConifg {

//	@Bean
//	@Profile("dev")
//	public iEmailerService dummyEmailSemder() {
//		return new DummyEmailSender();
//	}
	
	@Bean
//	@Primary
	@Profile("zomato")
	public IEmailerService SmtpEmailSender(JavaMailSender javaMailSender) {
		return new SmtpEmailSender(javaMailSender);
	}
}
