package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello2")
public class HelloController2 {
	
	@GetMapping
	public String hello2 ( ) {
		return "Hello World - Atividade 2!!!\n "
				+ "Essa semana pretendo estudar e aprender cada vez mais sobre esse assunto tão dificil ";
	}

}
