package com.spring.usersecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class UserSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSecurityApplication.class, args);
	}

}
