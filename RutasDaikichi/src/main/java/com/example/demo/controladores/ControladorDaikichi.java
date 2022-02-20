package com.example.demo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorDaikichi {
	
	@RequestMapping(value= "/daikichi" , method= RequestMethod.GET)
	public String despliegaWelcome() {
		
		return "Welcome!";
	}
	
	@RequestMapping(value= "/daikichi/today" , method= RequestMethod.GET)
	public String despliegaToday() {
		
		return "Today you will find luck in all your endeaovers!";
	}
	
	@RequestMapping(value= "/daikichi/tomorrow" , method= RequestMethod.GET)
	public String despliegaTomorrow() {
		
		System.out.println("Hola");
		return "Tomorrow, an opportunity will arise, so be sour to be open to new ideas! ";
	}
}
	
