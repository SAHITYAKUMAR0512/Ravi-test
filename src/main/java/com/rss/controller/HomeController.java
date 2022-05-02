package com.rss.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@RestController
public class HomeController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping(value="/news")
	public ResponseEntity<?> getNews(@RequestHeader HttpHeaders headers) throws JsonMappingException, JsonProcessingException
	{
		String url = headers.get("client_url").get(0);
		
		ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
		String body = forEntity.getBody();
		System.out.println(body);

		
		
		return new ResponseEntity<Object>(forEntity.getBody().toString(),HttpStatus.OK);
		
		
	}

}
