package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.DescontoSimplesRacional;

@RestController
@RequestMapping(value = "/calculadora/descontosimplesracional")
public class DescontoSimplesRacionalController {

	@GetMapping
	public DescontoSimplesRacional CalculoDescontoSimplesRacional(
			@RequestParam(name = "valorNominal") Float valorNominal,
			@RequestParam(name = "taxa") Float taxa, 
			@RequestParam(name = "prazo") Float prazo) {
		System.out.println(valorNominal+" "+taxa+" "+prazo);
		System.out.println((valorNominal/(1+taxa*prazo)));
		return new DescontoSimplesRacional(valorNominal, taxa, prazo);
	}
}
