package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class ValorFuturo {
	/*
	 * Fómula para o cálculo do
	 * valor futuro: M = C*(1+i)^t
	 * M = montante
	 * C = capital
	 * J = juros
	 * i = taxa
	 * t = prazo
	 */
	private Float montante; 
	private Float capital; 
	private Float juros;
	private Float taxa; 
	private Float prazo; 

	public ValorFuturo (Float capital,Float taxa,Float prazo) {
		this.capital = capital;
		this.taxa = taxa/100;
		this.prazo = prazo;
		this.montante = capital * (float) Math.pow((1+taxa/100),prazo);
		this.juros = montante - capital;
	}
	
}