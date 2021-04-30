package com.supere77.springboot;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
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
