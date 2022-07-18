package com.srv.springbootjenkinsdockerpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootJenkinsDockerPipelineApplication {
	
	
	@GetMapping("/test")
	public String getMessage() {
		return "jenkins deploy docker";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsDockerPipelineApplication.class, args);
	}

}
