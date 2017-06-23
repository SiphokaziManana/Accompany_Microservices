package com.mailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan("com.mailservice")
public class MailApplication {

	public static void main(String[] args){
		SpringApplication.run(com.mailservice.MailApplication.class, args);
	}
}