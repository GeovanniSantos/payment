package com.tools.payment.entities;

import com.tools.payment.enums.Tipo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;

@Embeddable
public class FormaPagamento {
	
	@Enumerated
    private Tipo tipo;
    private Integer parcelas;

	public FormaPagamento() {
	}

	public FormaPagamento(Tipo tipo, Integer parcelas) {
		this.tipo = tipo;
		this.parcelas = parcelas;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
}

