package com.calculadorafinanceira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.Montante;

@RestController
@RequestMapping(value = "/calculadora/montante")
public class MontanteController {


	@GetMapping("/{capital}&{taxa}&{prazo}")
	@ResponseBody
	public Montante CalcculoMontante(
			@PathVariable Float capital,
			@PathVariable Float taxa,
			@PathVariable Float prazo) {
		return new Montante(capital,taxa,prazo);
		}
}
