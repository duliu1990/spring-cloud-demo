/**
 * 
 */
package com.devnp.springcloudserviceprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author duliu
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServiceProviderApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringCloudServiceProviderApplication.class, args);
	}

}
