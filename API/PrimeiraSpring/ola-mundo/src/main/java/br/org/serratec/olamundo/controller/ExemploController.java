package br.org.serratec.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ExemploController {
	
	@GetMapping
	public String teste() {
		return "Teste Serratec";
	}
	@GetMapping("/maiuscula")
	public String maiuscula(@RequestParam String valor, @RequestParam String valor2) {
		return valor.toUpperCase().concat(valor2);
	}
	@GetMapping("/soma")
	public Double soma(@RequestParam Double valor, @RequestParam Double valor2){
		return valor + valor2;
	}
	@GetMapping("/sub")
	public Double sub(@RequestParam Double valor, @RequestParam Double valor2){
		return valor - valor2;
	}
	@GetMapping("/mult")
	public Double mult(@RequestParam Double valor, @RequestParam Double valor2){
		return valor * valor2;
	}
	@GetMapping("/div")
	public Double div(@RequestParam Double valor, @RequestParam Double valor2){
		return valor / valor2;
	}
	
}
