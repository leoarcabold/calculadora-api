package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.TaxaNominal;

@RestController
@RequestMapping(value = "/calculadora/taxanominal")
public class TaxaNominalController {

	@GetMapping
	public TaxaNominal CalculoTaxaNominal(
			@RequestParam(name = "taxaJuros") Float taxaJuros,
			@RequestParam(name = "taxaInflacao") Float taxaInflacao){
		return new TaxaNominal(taxaJuros, taxaInflacao);
	}
}
