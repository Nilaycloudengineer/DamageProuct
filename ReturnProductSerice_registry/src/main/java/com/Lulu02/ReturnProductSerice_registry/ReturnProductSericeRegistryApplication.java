package com.Lulu02.ReturnProductSerice_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ReturnProductSericeRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReturnProductSericeRegistryApplication.class, args);
	}

}
