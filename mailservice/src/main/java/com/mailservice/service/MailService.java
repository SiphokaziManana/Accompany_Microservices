package com.mailservice.service;

import com.mailservice.domain.MailTemplate;
import com.mailservice.domain.MailTemplateDTO;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Session;
import java.util.Properties;

/**
 * Created by siphokazi on 2017/06/21.
 */
@Service
public class MailService {

	private MailTemplateDTO result;

	public void sendMail(String messageBody, String emailTo)
	{
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication("groupquadcore@gmail.com", "quadcore123");
					}
				}
		);

		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("siphokazi.manana@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(emailTo));
			message.setSubject("Welcome to Accompany");
			message.setText(messageBody);

			Transport.send(message);
			result = new MailTemplateDTO("Registration Email Sent","SUCCESS" );
			System.out.println("Registration Email Sent");

		}
		catch (MessagingException e) {
			//throw new RuntimeException(e);
			result = new MailTemplateDTO("An exception was thrown, the exception is: \n \n"
			+ e, "Error - EXCEPTION");
		}
	}

	public MailTemplateDTO sendMail(MailTemplate mail){
		sendMail(mail.getMessageBody(), mail.getEmailTo());
		return result;
	}
}