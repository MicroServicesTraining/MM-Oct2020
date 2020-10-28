package com.mm.sb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MmSbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmSbDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String getIndex() {
		return "<h1>Welcome To MindMajix</h1>";
	}

}
