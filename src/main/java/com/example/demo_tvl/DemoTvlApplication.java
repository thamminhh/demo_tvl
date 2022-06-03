package com.example.demo_tvl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoTvlApplication {
	@GetMapping("/message")
	public String message(){
		return "Ola hahaha";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoTvlApplication.class, args);
	}

}
