package com.example.freecodecamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FreecodecampApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreecodecampApplication.class, args);
	}

}
