package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class DescontoSimplesComercial {
	/*
	 * Fómula para o cálculo do desconto
	 * simples comercial: d = N * i * n
	 * d = valor do desconto
	 * N = valor nominal
	 * i = taxa
	 * n = tempo
	 * A = valor atual
	 */

	private Float desconto;
	private Float valorNominal;
	private Float taxa;
	private Float tempo;
	private Float valorAtual;

	public DescontoSimplesComercial(Float valorNominal, Float taxa, Float tempo) {
		this.valorNominal = valorNominal;
		this.taxa = (taxa/100)/30;
		this.tempo = tempo;
		this.desconto = valorNominal * (taxa/100/30) * tempo;
		this.valorAtual = valorNominal - desconto;
	}
}