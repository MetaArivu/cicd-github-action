package com.ebs.demo.ebsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EBSDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBSDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public ResponseEntity<String> welcome(){
		return new ResponseEntity<String>("Welcome to EBS Demo V1", HttpStatus.OK);
	}

}
