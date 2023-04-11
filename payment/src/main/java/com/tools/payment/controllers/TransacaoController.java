package com.tools.payment.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tools.payment.entities.Transacao;
import com.tools.payment.services.TransacaoService;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController{
	
	@Autowired
	private TransacaoService transacaoService;
	
	/*@PostMapping
	public Transacao adicionar(@RequestBody Transacao transacao) {
		return transacaoRepository.save(transacao);
	}*/
	
	@PostMapping
	public ResponseEntity<Transacao> adicionar(@RequestBody Transacao transacao){
		return ResponseEntity.status(HttpStatus.CREATED).body(transacaoService.salvarTransacao(transacao));
	}
}