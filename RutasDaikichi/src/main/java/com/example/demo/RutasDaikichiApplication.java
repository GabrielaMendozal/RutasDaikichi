package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RutasDaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RutasDaikichiApplication.class, args);
	}
	@RequestMapping( value = "/" ,  method = RequestMethod.GET)
	public String despliegaInicio() {
		return "Daikichi";
	}
}
