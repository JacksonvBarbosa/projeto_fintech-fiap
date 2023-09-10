package br.com.fiap.banco.model;

import br.com.fiap.banco.controller.contas.Conta;
import br.com.fiap.banco.controller.contas.ContaCorrente;

public class Cliente extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	
	ContaCorrente cliente = new ContaCorrente();
	Conta conta = new Conta();
	
}
