package com.clientservice.domain;

/**
 * Created by siphokazi on 2017/06/23.
 */
public class MailResponse {

    String responseMessage;
    String responseStatus;

    public MailResponse(String responseMessage, String responseStatus){
        this.responseStatus = responseStatus;
        this.responseMessage = responseMessage;
    }

    public void setResponseMessage(String message){
        this.responseMessage = message;
    }
    public String getResponseMessage(){
        return responseMessage;
    }

    public void setResponseStatus(String responseStatus){
        this.responseStatus = responseStatus;
    }
    public String getResponseStatus(){
        return responseStatus;
    }
}
