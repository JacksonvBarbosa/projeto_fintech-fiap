package br.com.fiap.banco;

public class Cliente extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	
	ContaCorrente cliente = new ContaCorrente();
	Conta conta = new Conta();
	
}
