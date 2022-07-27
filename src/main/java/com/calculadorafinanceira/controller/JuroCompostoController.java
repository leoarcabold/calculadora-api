package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.TaxaEquivalente;

@RestController
@RequestMapping(value = "/calculadora/taxaequivalente")
public class JuroCompostoController {


	@GetMapping("/{tipoTaxa}&{taxa}&{prazo}")
	@ResponseBody
	public TaxaEquivalente CalculaTaxaEquivalente(
			@PathVariable String tipoTaxa,
			@PathVariable Float taxa,
			@PathVariable Float prazo) {
		return new TaxaEquivalente(tipoTaxa,taxa,prazo);
		}
}
