/**
 * 
 */
package com.devnp.springcloudserviceprovider.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author duliu
 *
 */
@RestController
public class ProviderController {

	@GetMapping("/hello")
	public Object hello() {
		return "Hello Wolrd!" ;
	}
}
