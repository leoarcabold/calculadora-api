package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class JuroSimples {
	/*
	 * Fómula para o cálculo do
	 * juros simples: J = c*i*t
	 * c = capital
	 * J = juros
	 * i = taxa
	 * t = prazo
	 */
	private Float capital; 
	private Float juros;
	private Float taxa; 
	private Integer prazo; 

	public JuroSimples (Float capital,Float taxa,Integer prazo) {
		this.capital = capital;
		this.taxa = taxa/100;
		this.prazo = prazo;
		this.juros = capital*taxa*prazo;
	}
	
}