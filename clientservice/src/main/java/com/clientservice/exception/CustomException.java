package com.clientservice.exception;


public class CustomException extends Throwable{

    String description;
    String name;

    public CustomException(){}
    public CustomException (String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    public  String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
