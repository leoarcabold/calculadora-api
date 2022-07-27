package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.JuroComposto;

@RestController
@RequestMapping(value = "/calculadora/jurocomposto")
public class JuroCompostoController {


	@GetMapping("/{capital}&{taxa}&{prazo}")
	@ResponseBody
	public JuroComposto CalculaTaxaEquivalente(
			@PathVariable Float capital,
			@PathVariable Float taxa,
			@PathVariable Float prazo) {
		return new JuroComposto(capital,taxa,prazo);
		}
}
