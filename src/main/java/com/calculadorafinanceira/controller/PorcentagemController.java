package com.calculadorafinanceira.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculadorafinanceira.model.Porcentagem;

@RestController
@RequestMapping(value = "/calculadora/porcentagem")
public class PorcentagemController {

	@PostMapping
	public Porcentagem CalculaValorFuturo(@RequestParam(name = "taxa") Float taxa) { 
		return new Porcentagem(taxa);
	}
}
