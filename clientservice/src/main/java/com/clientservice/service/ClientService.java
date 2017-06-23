
package com.clientservice.service;

import com.clientservice.domain.Client;
import com.clientservice.domain.MailRequest;
import com.clientservice.domain.MailResponse;
import com.clientservice.exception.CustomException;
import com.clientservice.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.inject.Inject;

@Service
public class ClientService {

	@Inject
	ClientRepository clientRepository;

	@Inject
	RestTemplate restTemplate;

	public Client storeClientInformation(Client client){
		Client result = clientRepository.save(client);
		MailResponse response = restTemplate.postForObject("localhost:8761/api/mail/sendMail", new MailRequest("groupquadcore@gmail.com",
				client.getClientEmail(),"Thank you for registering with Accompany"), MailResponse.class);
		System.out.println("Response from mail server is: " + response);
		return result;
	}

	public Client retrieveClientDetails(String email) throws CustomException{
		Client obj = clientRepository.findByClientEmail(email);
		if ( obj == null){
			throw new CustomException("Not Found", "The client you are searching for cannot be found");
		}
		return obj;
	}
}