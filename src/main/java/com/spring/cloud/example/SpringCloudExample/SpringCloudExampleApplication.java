package com.spring.cloud.example.SpringCloudExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudExampleApplication.class, args);
	}

}
