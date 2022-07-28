package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.ValorFuturo;

@RestController
@RequestMapping(value = "/calculadora/valorfuturo")
public class ValorFuturoController {

	@PostMapping
	public ValorFuturo CalculaValorFuturo(
			@RequestParam(name = "capital") Float capital,
			@RequestParam(name = "taxa") Float taxa, 
			@RequestParam(name = "prazo") Float prazo) {
		return new ValorFuturo(capital, taxa, prazo);
	}
}
