package com.tools.payment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tools.payment.entities.Transacao;
import com.tools.payment.repositories.TransacaoRepository;

@Service
public class TransacaoService{

	@Autowired
	private TransacaoRepository transacaoRepository;
	 
	public Transacao salvarTransacao(Transacao transacao) {
	return transacaoRepository.save(transacao);
	}
}