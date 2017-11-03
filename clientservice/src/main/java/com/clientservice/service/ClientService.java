
package com.clientservice.service;

import com.clientservice.domain.Client;
import com.clientservice.domain.MailRequest;
import com.clientservice.domain.MailResponse;
import com.clientservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ClientService {

	@Autowired
	//@Inject
	ClientRepository clientRepository;

	//@Autowired
	//@Inject
	RestTemplate restTemplate = new RestTemplate();

	public Client storeClientInformation(Client client){
		Client result = clientRepository.save(client); //a
		try{ //a //b //c
			MailResponse response = restTemplate.postForObject("http://localhost:8761/api/mail/sendMail", new MailRequest("groupquadcore@gmail.com",
				client.getClientEmail(),"Thank you for registering with Accompany"), MailResponse.class); //a //b
		}
		catch (Exception e){
			System.out.println("Mail could not be sent");
			e.printStackTrace(); //c
		}
		return result; //a
	}

}