package com.tools.payment.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tools.payment.enums.Status;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Enumerated;

@Embeddable
public class Descricao {
	
    private BigDecimal valor;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataHora;
    private String estabelecimento;
    
    @Enumerated
    private Status status;
    
	public Descricao() {
	}

	public Descricao(BigDecimal valor, LocalDateTime dataHora, String estabelecimento, Status status) {
		this.valor = valor;
		this.dataHora = dataHora;
		this.estabelecimento = estabelecimento;
		this.status = status;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public LocalDateTime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}
	public String getEstabelecimento() {
		return estabelecimento;
	}
	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}

