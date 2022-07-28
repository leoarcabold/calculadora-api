package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.VariacaoPercentual;

@RestController
@RequestMapping(value = "/calculadora/variacaopercentual")
public class VariacaoPercentualController {

	@GetMapping
	public VariacaoPercentual CalculoVariacaoPercentual(
			@RequestParam(name = "valorFinal") Float valorFinal,
			@RequestParam(name = "valorInicial") Float valorInicial) {
		return new VariacaoPercentual(valorFinal, valorInicial);
	}
}
