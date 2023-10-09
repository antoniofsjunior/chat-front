package edu.ifam.dra.chatfront.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.ifam.dra.chatfront.model.Contato;

@Service
public class ContatoFrontService {

	public List<Contato> getContatos(){
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Contato[]> response =  restTemplate.getForEntity(
			"http://localhost:8080/contato", Contato[].class);
		return new ArrayList(Arrays.asList(response.getBody()));
	}
	
}
