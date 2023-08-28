package com.java;

import java.io.Serializable;

public class Conta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numero;
	private int agencia;
	private double saldo;
	
	//Criar objeto através da classe Cliente
	Cliente cliente = new Cliente();
	
	//contrutor padrão 
	public Conta() {	
	}
	
	//Construtor de classe com 3 parametros
	public Conta (int numero, int agencia, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}


	//gets e sets
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return Saldo da Conta*/
	public double getSaldo() {
		return this.saldo;
	}
	
	//Metodos Retirar e Depositar
	
	/**
	 * Acrescenta um valor ao Saldo da Conta
	 * @param valor que será depositado
	 * @see depositar*/
	public void depositar(double valor) {
		this.saldo += valor;
	}

	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor  que será retirado
	 * @see retirar*/
	public void retirar(double valor) {
		this.saldo -= valor;
	}
} 
