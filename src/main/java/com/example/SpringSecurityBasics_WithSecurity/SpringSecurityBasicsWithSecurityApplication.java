package com.example.SpringSecurityBasics_WithSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.SpringSecurityBasics_WithSecurity.Controller")
public class SpringSecurityBasicsWithSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicsWithSecurityApplication.class, args);
	}

}
