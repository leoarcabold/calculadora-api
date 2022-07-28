package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class DescontoSimplesRacional {
	/*
	 * Fómula para o cálculo de
	 * desconto simples racional: A=N/(1+i*n)
	 * Dr = N -A 
	 * Dr = desconto realizado
	 * A = valor atual
	 * N = valor nominal
	 * i = taxa de desconto
	 * n = quantidade de períodos
	 */

	private Float descontoRealizado;
	private Float valorAtual;
	private Float valorNominal;
	private Float taxa;
	private Float prazo;

	public DescontoSimplesRacional(Float valorNominal, Float taxa, Float prazo) {
		this.valorNominal = valorNominal;
		this.taxa = taxa/100;
		this.prazo = prazo;
		this.valorAtual = (valorNominal/(1+(taxa/100)*prazo));
		this.descontoRealizado = valorNominal - valorAtual;
	}
}