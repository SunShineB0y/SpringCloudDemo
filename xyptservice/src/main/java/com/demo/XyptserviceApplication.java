package com.demo;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2Doc
public class XyptserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(XyptserviceApplication.class, args);
	}

}
