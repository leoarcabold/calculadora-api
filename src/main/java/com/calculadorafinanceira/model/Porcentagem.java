package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class Porcentagem {
	/*
	 * Fómula para o cálculo de 
	 * porcentagem: P = P/100
	 */

	private Float taxa;

	public Porcentagem(Float taxa) {
		this.taxa = taxa/100;
	}

}