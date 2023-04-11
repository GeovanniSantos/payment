package com.tools.payment.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.tools.payment.enums.StatusTransacaoEnum;
import com.tools.payment.enums.TipoPagamentoEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Transacao {

    @Id
    private String id;

    private String cartao;

    @Enumerated(EnumType.STRING)
    private TipoPagamentoEnum tipo;

    private Integer parcelas;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private StatusTransacaoEnum status;

    private LocalDateTime dataHora;

    private String estabelecimento;

    public Transacao() {
    }

    public Transacao(String id, String cartao, TipoPagamentoEnum tipo, Integer parcelas, BigDecimal valor,
                     StatusTransacaoEnum status, LocalDateTime dataHora, String estabelecimento) {
        this.id = id;
        this.cartao = cartao;
        this.tipo = tipo;
        this.parcelas = parcelas;
        this.valor = valor;
        this.status = status;
        this.dataHora = dataHora;
        this.estabelecimento = estabelecimento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public TipoPagamentoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamentoEnum tipo) {
        this.tipo = tipo;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public StatusTransacaoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusTransacaoEnum status) {
        this.status = status;
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
}