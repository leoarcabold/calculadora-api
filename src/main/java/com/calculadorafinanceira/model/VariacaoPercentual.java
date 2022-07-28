package com.calculadorafinanceira.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Component
@NoArgsConstructor
public class VariacaoPercentual {
	/*
	 * Fómula para o cálculo de
	 * variação percentual: V = ((vf-vi)/vi)/100
	 * V = variação
	 * vf = valor final
	 * vi = valor inicial
	 * Por exemplo, um produto que custava R$10 
	 * aumentou para R$15, 
	 * Qual foi a variação percentual de aumento?
	 */
	
	private Float variacao; 
	private Float valorFinal; 
	private Float valorInicial; 

	public VariacaoPercentual (Float valorFinal,Float valorInicial) {
		this.valorFinal = valorFinal;
		this.valorInicial = valorInicial;
		this.variacao = ((valorFinal-valorInicial)/valorInicial)*100;
	}
	
}