package com.example.demo.Emailer;

import javax.mail.MessagingException;

public interface IEmailerService {
		void sendEmail(String emailID,String subject,String mailContent) throws MessagingException;
}
