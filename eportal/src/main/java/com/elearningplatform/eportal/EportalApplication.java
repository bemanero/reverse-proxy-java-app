package com.elearningplatform.eportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class EportalApplication {
@GetMapping("/purpose")
    public String purpose(){
        return "This is a template of an Elearning platform";
    }
	public static void main(String[] args) {
		SpringApplication.run(EportalApplication.class, args);
	}

}
