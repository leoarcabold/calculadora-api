package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.DescontoSimplesRacional;

@RestController
@RequestMapping(value = "/calculadora/descontosimplesracional")
public class DescontoSimplesRacionalController {

	@PostMapping
	public DescontoSimplesRacional CalculoDescontoSimplesRacional(
			@RequestParam(name = "N") Float N,
			@RequestParam(name = "i") Float i, 
			@RequestParam(name = "n") Float n){
		return new DescontoSimplesRacional(N,i, n);
	}
}
