package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class TaxaEquivalente {
	/*
	 * Fómula para o cálculo da taxa equivalente: 1+ia = (1+im)^t) ia = taxa anual
	 * im = taxa mensal t = prazo
	 */

	private Float ia;
	private Float im;
	private Float prazo;
	private String tipoTaxa;
	private Float taxa;

	public TaxaEquivalente(String tipoTaxa, Float taxa, Float prazo) {
		this.tipoTaxa = tipoTaxa;
		this.taxa = taxa;
		this.prazo = prazo;
		validaTaxa(tipoTaxa, taxa);
	}

	public void validaTaxa(String tipoTaxa, Float taxa) {
		System.out.println(tipoTaxa.equalsIgnoreCase("im"));
		if (tipoTaxa.equalsIgnoreCase("ia")) {
			this.im = ((float) Math.pow((1 + taxa / 100), 1 / prazo) - 1) * 100;
			this.ia = taxa;
		}
		if (tipoTaxa.equalsIgnoreCase("im")) {
			this.ia = ((float) Math.pow((1 + taxa / 100), prazo) - 1) * 100;
			this.im = taxa;
		}
	}
}