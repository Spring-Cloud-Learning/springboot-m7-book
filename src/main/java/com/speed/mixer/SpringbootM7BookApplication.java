package com.speed.mixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient
@EnableDiscoveryClient
public class SpringbootM7BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootM7BookApplication.class, args);
	}
}
