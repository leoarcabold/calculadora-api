package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;
import java.lang.Math;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class JuroComposto {
	/*
	 * Fómula para o cálculo do
	 * juros composto: M = C*(1+i)^t
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

	public JuroComposto (Float capital,Float taxa,Float prazo) {
		this.capital = capital;
		this.taxa = taxa/100;
		this.prazo = prazo;
		this.montante = capital * (float) Math.pow((1+taxa/100),prazo);
		this.juros = montante - capital;
	}
	
}