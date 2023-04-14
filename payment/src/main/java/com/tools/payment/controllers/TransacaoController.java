package com.tools.payment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public ResponseEntity<Transacao> pagamentoPorId(@PathVariable Long id){
		Transacao transacao = transacaoService.pagamentoPorId(id);
		return ResponseEntity.ok(transacao);
	}
	
	@GetMapping
	public List<Transacao> listarPagamentos(){
		return transacaoService.listarPagamentos();
	}
	
	@PostMapping
	public ResponseEntity<Transacao> pagamento(@RequestBody Transacao transacao){
		return ResponseEntity.status(HttpStatus.CREATED).body(transacaoService.salvarTransacao(transacao));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Transacao> estorno(@PathVariable Long id){
		Transacao estorno = transacaoService.estorno(id);
		return ResponseEntity.ok(estorno);
	}
	
}