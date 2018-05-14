/**
 * 
 */
package com.devnp.springcloudserviceconsumer.web;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author duliu
 *
 */
@RestController
public class ConsumerContoller {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/hello")
	public Object hello() {
		String reponse = restTemplate.getForObject("http://spring-cloud-service-provider/hello", String.class, CollectionUtils.EMPTY_COLLECTION);
		
		return reponse ;
	}
}
