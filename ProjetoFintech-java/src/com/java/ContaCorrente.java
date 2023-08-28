package com.java;

public class ContaCorrente extends Conta {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipo;
	private double chequeEspecial;
	public String getTipo() {
		return tipo;
	}
	
	
	//Padrão Java BEANS Gets and Sets
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	public double getSaldoDisponivel() {
		return super.getSaldo() + chequeEspecial;//Busca o saldo da conta mãe e soma ao cheque especial definido pelo banco quanto o cliente tem de saldo fora o valor liquido da conta
	}

	// Usando POLIMORFISMO (Sobreescrita) um método de ter um mesmo método mais com parametros diferentes
	@Override //Override é um anotação como se fosse uma subprogramação
	//Ele ira POSSIBILITAR SobreEscrever o método retirar da Classe Conta quando for chamado pela Subclasse ContaCorrente
	public void retirar(double valor) {
		valor += 10; //Adicionar um valor de taxa
		super.retirar(valor); //Acessa o m´´etodo retirar da sperclaase conta e passa o valor atualizado que seria saldo + chequeespecial
	}
}

