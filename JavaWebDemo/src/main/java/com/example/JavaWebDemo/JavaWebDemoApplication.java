package com.example.JavaWebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class JavaWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication myApplication = new SpringApplication(JavaWebDemoApplication.class);
		myApplication.setApplicationStartup(new BufferingApplicationStartup(2048));
		myApplication.run(args);
	}

	@GetMapping("/welcome")
    public String getMethod(){

		return "Welcome in Java World";

	}
	

}
