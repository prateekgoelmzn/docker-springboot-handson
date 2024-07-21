package com.pg.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1")
public class DockerApplication {

	@GetMapping("/hello")
	public ResponseEntity<String> hello(@RequestParam(name="msg",required = false) String message){
		StringBuilder sb = new StringBuilder();
		if(message!=null){
			sb.append(message);
		}
		return ResponseEntity.ok(String.format("Hello %s",sb.toString()));
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
