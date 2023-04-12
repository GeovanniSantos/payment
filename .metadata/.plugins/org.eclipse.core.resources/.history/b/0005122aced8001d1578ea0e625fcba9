package com.tools.payment.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cartao;
    private String transacaoId;
    private Descricao descricao;
    private FormaPagamento formaPagamento;
    
	public Transacao() {
	}

	public Transacao(Long id, String cartao, String transacaoId, Descricao descricao, FormaPagamento formaPagamento) {
		this.id = id;
		this.cartao = cartao;
		this.transacaoId = transacaoId;
		this.descricao = descricao;
		this.formaPagamento = formaPagamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public String getTransacaoId() {
		return transacaoId;
	}

	public void setTransacaoId(String transacaoId) {
		this.transacaoId = transacaoId;
	}

	public Descricao getDescricao() {
		return descricao;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
}

