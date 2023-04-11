package com.tools.payment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tools.payment.entities.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
