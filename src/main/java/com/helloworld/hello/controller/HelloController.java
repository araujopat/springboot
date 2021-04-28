package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
	
	@GetMapping
	public String hello ( ) {
		return "Hello World - Atividade 1!!!\n "
				+ "Para realizar essa atividade usei a habilidade de persistencia e a mentalidade de orientação ao futuro. ";
	}

}
