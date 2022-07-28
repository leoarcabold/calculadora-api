package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.Montante;

@RestController
@RequestMapping(value = "/calculadora/montante")
public class MontanteController {


	@GetMapping
	@ResponseBody
	public Montante CalcculoMontante(
			@RequestParam(name = "capital") Float capital,
			@RequestParam(name = "taxa") Float taxa,
			@RequestParam(name = "prazo") Float prazo) {
		return new Montante(capital,taxa,prazo);
		}
}
