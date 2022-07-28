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
	 * Dr = N -A 
	 * Dr = desconto realizado
	 * A = valor atual
	 * N = valor nominal
	 * i = taxa de desconto
	 * n = quantidade de períodos
	 */

	private Float Dr;
	private Float A;
	private Float N;
	private Float i;
	private Float n;

	public DescontoSimplesRacional(Float N, Float i, Float n) {
		this.N = N;
		this.i = i;
		this.n = n;
		this.A = (N/(1+i*n));
		this.Dr = N-A;
	}
}