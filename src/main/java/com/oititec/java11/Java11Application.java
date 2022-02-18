package com.oititec.java11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@RestController
@Slf4j
public class Java11Application {

	public static void main(String[] args) {
		SpringApplication.run(Java11Application.class, args);
	}

	@GetMapping("/")
	public String Index() {

		log.info("log: Olá mundo");

		return "Olá Mundo";
	}

}
