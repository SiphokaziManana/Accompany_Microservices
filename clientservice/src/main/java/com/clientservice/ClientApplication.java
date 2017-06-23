package com.clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration
@EnableDiscoveryClient
//@SpringBootApplication
@ComponentScan("com.clientservice")
public class ClientApplication {

	public static void main(String[] args){
		SpringApplication.run(com.clientservice.ClientApplication.class, args);
	}
}