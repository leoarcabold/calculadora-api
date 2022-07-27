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
public class TaxaEquivalente {
	/*
	 * Fómula para o cálculo da
	 * taxa equivalente: 1+ia = (1+im)^t)
	 * ia = taxa anual
	 * im = taxa mensal
	 * t = prazo
	 */
	
	private Float ia; 
	private Float im; 
	private Float prazo; 
	private String tipoTaxa;

	public TaxaEquivalente (String tipoTaxa, Float taxa, Float prazo) {
		this.prazo = prazo;
	if (tipoTaxa == "ia") {
		this.ia = taxa;
		this.im =((float)Math.pow((1+taxa/100), 1/prazo)-1)*100;
	}	
	if (tipoTaxa == "im") {
		this.im = taxa;
		this.ia = ((float)Math.pow((1+taxa/100), prazo)-1)*100;
	}
}
}