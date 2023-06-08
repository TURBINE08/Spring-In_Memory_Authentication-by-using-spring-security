package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityFullProjectMrRaghu2Application {

	public static void main(String[] args) {
		
//		BCryptPasswordEncoder enc  = new BCryptPasswordEncoder();
//		System.err.println(enc.encode("seyad"));
		
		SpringApplication.run(SpringSecurityFullProjectMrRaghu2Application.class, args);
	}

}
