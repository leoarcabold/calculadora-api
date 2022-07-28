package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.TaxaEquivalente;

@RestController
@RequestMapping(value = "/calculadora/taxaequivalente")
public class TaxaEquivalenteController {


	@GetMapping
	public TaxaEquivalente CalculoTaxaEquivalente(
			@RequestParam(name = "tipoTaxa") String tipoTaxa,
			@RequestParam(name = "taxa") Float taxa,
			@RequestParam(name = "prazo") Float prazo) {
		return new TaxaEquivalente(tipoTaxa,taxa,prazo);
		}
}
