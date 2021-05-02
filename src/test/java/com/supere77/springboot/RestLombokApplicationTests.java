package com.supere77.springboot;

import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest( webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestLombokApplicationTests {
	
	@LocalServerPort
	private int randomServerPort;

	@Test
	public void testGet() {
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String > result = template.getForEntity("http://localhost:"+randomServerPort+"/messages", String.class);
		
			assertThat(result.getStatusCode(), equalTo(HttpStatus.OK) );
		
	}

}
