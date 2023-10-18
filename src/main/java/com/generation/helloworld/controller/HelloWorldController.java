package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}	
	
	@GetMapping("bsm")
	public String listarBSM() {
		return
		("BSMs - Generation Brasil\n\n"

		+ "Mentalidade de Crescimento\n"
		+ "Persistência\n"
		+ "Responsabilidade Pessoal\n"
		+ "Orientação ao Futuro\n"
		+ "Orientação ao Detalhe\n"
		+ "Proatividade\n"
		+ "Trabalho em Equipe\n"
		+ "Comunicação");
	}
		
	@GetMapping("objetivos")
	public String objetivos(){
		return
		("Lista de objetivos\n\n"

		+"Finalizar os projetos\n"
		+"Terminar todos os exercicios\n"
		+"Terminar de ler todos os cookbooks\n\n");
	}
		

}


