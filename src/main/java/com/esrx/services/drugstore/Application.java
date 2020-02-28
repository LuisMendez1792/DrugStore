package com.esrx.services.drugstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



//@EnableAutoConfiguration(exclude={DataSourceConfiguration.class})
@ComponentScan(basePackages = {"com.esrx.services.drugstore"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

