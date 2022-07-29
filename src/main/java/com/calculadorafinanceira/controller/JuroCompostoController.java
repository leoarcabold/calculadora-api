package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.JuroComposto;

@RestController
@RequestMapping(value = "/calculadora/jurocomposto")
public class JuroCompostoController {


	@GetMapping
	@ResponseBody
	public JuroComposto JuroComposto(
			@RequestParam(name = "capital") Float capital,
			@RequestParam(name = "taxa") Float taxa,
			@RequestParam(name = "prazo")Float prazo) {
		return new JuroComposto(capital,taxa,prazo);
		}
}
