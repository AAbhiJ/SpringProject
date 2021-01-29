package com.example.demo.Emailer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

//This object gets created  by using  @Componet and refered  as beans
//@Component("smtpBean")
////@Primary
//@Qualifier("smtp")

public class SmtpEmailSender implements IEmailerService {

	private static Log log = LogFactory.getLog(SmtpEmailSender.class);
	private JavaMailSender javaMailSender;
	public SmtpEmailSender(JavaMailSender javaMailSender) {
		
		this.javaMailSender = javaMailSender;
	}
	@Override
	public void sendEmail(String emailID, String subject, String mailContent) throws MessagingException {
		// TODO Auto-generated method stub
		log.info("SMTP mail receiver id:"+emailID);
		log.info("SMTP mail subject:"+subject);
		log.info("SMTP mail body:"+mailContent);
		log.warn("This is just a SMTP email sender");
		
		
//		private JavaMailSender javaMailSender;
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper;

		helper = new MimeMessageHelper(message, true); // true indicates
 					  				                   // multipart message
		helper.setSubject("Welcom to my Email Test");
		helper.setTo("bhosaleaditya170@gmail.com");
		helper.setText("<h1>Thank Youuuu</h1>", true); // true indicates html

		// continue using helper for more functionalities
        // like adding attachments, etc.  
		
javaMailSender.send(message);
	}
	
	
}
