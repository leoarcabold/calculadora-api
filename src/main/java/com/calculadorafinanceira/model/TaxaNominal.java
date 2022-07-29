package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class TaxaNominal {
	/*
	 * Fómula para o cálculo de
	 * taxa normal: V = ((vf-vi)/vi)/100
	 * in = taxa de juros nominal
	 * j = taxa de inflação do período
	 * r = taxa real de juros
	 */
	
	private Float taxaJuros; 
	private Float taxaInflacao; 
	private Float taxaReal; 

	public TaxaNominal(Float taxaJuros,Float taxaInflacao) {
		this.taxaJuros = taxaJuros/100;
		this.taxaInflacao = taxaInflacao/100;
		this.taxaReal = calculaTaxaReal();
	}
	
	private Float calculaTaxaReal() {	
		return (((1+taxaJuros)-(1+taxaInflacao))/(1+taxaInflacao))*100;
	}
	
}