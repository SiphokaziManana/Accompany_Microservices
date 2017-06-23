
package com.mailservice.domain;

import javax.persistence.*;
import java.util.Date;


public class MailTemplate {

	String emailTo;

	String emailFrom;

	String messageBody;

	Date date;

	public MailTemplate(){
		emailFrom = "groupquadcore@gmail.com";
		emailTo = "siphokazi.manana@gmail.com	";
		messageBody = "Default message sent for Microservices Test";
		date = new Date();
	}

	public MailTemplate(String emailFrom, String emailTo, String messageBody){
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.messageBody = messageBody;
		this.date = new Date();
	}

	public void setEmailTo(String emailTo){
		this.emailTo = emailTo;
	}
	public String getEmailTo(){
		return emailTo;
	}

	public void setEmailFrom(String emailFrom){
		this.emailFrom = emailFrom;
	}
	public String getEmailFrom(){
		return emailFrom;
	}

	public void setMessageBody( String messageBody){
		this.messageBody = messageBody;
	}
	public String getMessageBody(){
		return messageBody;
	}

	public void setDate( Date date){
		this.date = date;
	}
	public Date getDate(){
		return this.date;
	}
}