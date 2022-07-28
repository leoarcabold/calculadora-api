package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.DescontoSimplesComercial;

@RestController
@RequestMapping(value = "/calculadora/descontosimplescomercial")
public class DescontoSimplesComercialController {

	@GetMapping
	public DescontoSimplesComercial CalculoDescontoSimplesRacional(
			@RequestParam(name = "valorNominal") Float valorNominal,
			@RequestParam(name = "taxa") Float taxa, 
			@RequestParam(name = "tempo") Float tempo) {
		return new DescontoSimplesComercial(valorNominal, taxa, tempo);
	}
}
