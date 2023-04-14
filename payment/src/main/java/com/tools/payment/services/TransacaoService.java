package com.tools.payment.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tools.payment.entities.Transacao;
import com.tools.payment.enums.Status;
import com.tools.payment.repositories.TransacaoRepository;

@Service
public class TransacaoService {

	@Autowired
	private TransacaoRepository transacaoRepository;

	public Transacao salvarTransacao(Transacao transacao) {
		transacao.getDescricao().setStatus(Status.AUTORIZADO);
		return transacaoRepository.save(transacao);
	}

	public List<Transacao> listarPagamentos() {
		return transacaoRepository.findAll();
	}

	public Transacao pagamentoPorId(Long id) {
	    return transacaoRepository.findById(id).orElse(null);
	}
	
	public Transacao estorno(Long id) {
        Transacao transacao = transacaoRepository.findById(id).orElse(null);
        transacao.getDescricao().setStatus(Status.CANCELADO);
        return transacaoRepository.save(transacao);
    }
}