package com.example.Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Ejercicio1")
public class Controller {
	
	private String saludo = "Hola mundo!";
	
	@GetMapping("/saludar")
	private String getSaludo () {
		
		return this.saludo;
		
	}
	
}
