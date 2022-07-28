package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.JuroSimples;

@RestController
@RequestMapping(value = "/calculadora/jurosimples")
public class JurosSimplesController {


	@GetMapping
	@ResponseBody
	public JuroSimples CalculoJuroSimples(
			@RequestParam(name = "capital") Float capital,
			@RequestParam(name = "taxa") Float taxa,
			@RequestParam(name = "prazo") Integer prazo) {
		return new JuroSimples(capital,taxa,prazo);
		}
}
