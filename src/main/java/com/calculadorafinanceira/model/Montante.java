package com.calculadorafinanceira.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class Montante {
	/*
	 * Fómula para o cálculo do
	 * montante: M = C(1+(i*t))
	 * M = Montante
	 * C = Capital
	 * J = Juros
	 * i = Taxa
	 * t = prazo
	 */
	private Float montante; 
	private Float capital; 
	private Float juros;
	private Float taxa; 
	private Float prazo; 

	public Montante (Float capital,Float taxa,Float prazo) {
		this.capital = capital;
		this.taxa = taxa/100;
		this.prazo = prazo;
		this.juros = capital*taxa*prazo;
		this.montante = capital + juros;
	}
	
}
