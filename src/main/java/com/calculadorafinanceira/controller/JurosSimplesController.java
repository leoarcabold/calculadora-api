package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.JuroSimples;

@RestController
@RequestMapping(value = "/calculadora/jurosimples")
public class JurosSimplesController {


	@GetMapping("/{capital}&{taxa}&{prazo}")
	@ResponseBody
	public JuroSimples CalculoJuroSimples(
			@PathVariable Float capital,
			@PathVariable Float taxa,
			@PathVariable Integer prazo) {
		return new JuroSimples(capital,taxa,prazo);
		}
}
