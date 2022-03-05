package com.santosh.greenzone.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication




 
@PropertySources({
	@PropertySource("classpath:/application.properties"),
	@PropertySource("classpath:/greenzone.properties"),
	@PropertySource("classpath:/dbquery.properties")})

public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
		String strClassPath = System.getProperty("java.class.path");
		System.out.println("Classpath is =" + strClassPath);
	}

}
