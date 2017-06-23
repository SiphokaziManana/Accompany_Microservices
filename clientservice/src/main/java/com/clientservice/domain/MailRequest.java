package com.clientservice.domain;

import java.util.Date;

/**
 * Created by siphokazi on 2017/06/23.
 */
public class MailRequest {

    public MailRequest(String emailFrom, String emailTo, String messageBody){
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.messageBody = messageBody;
        this.date = new Date();
    }

    String emailTo;

    String emailFrom;

    String messageBody;

    Date date;

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
