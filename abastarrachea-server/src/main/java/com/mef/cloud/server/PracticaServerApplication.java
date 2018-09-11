package com.mef.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PracticaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaServerApplication.class, args);
	}
}
