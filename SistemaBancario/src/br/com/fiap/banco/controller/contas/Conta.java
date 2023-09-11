package br.com.fiap.banco.controller.contas;

import java.io.Serializable;
import java.util.Scanner;



/**
 * Classe que abstrai uma Conta Bancária
 * @author Thiago Yamamoto
 * @version 1.0<h3> */

//É de boa pratica incrementar o Serializable eo serialVersionUID
public class Conta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//atributos
	private int agencia;
	private int numero;
	private double deposito;
	private double saque;
	private double saldo;
	
	//Construtor Padrão da Classe Conta
	public Conta() {}
	
	//Construtor da Classe Conta
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		}
	
	//Getters and Setters
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}
	
	//métodos
	void setarContaAgencia() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Conta: ");
		int conta = entrada.nextInt();
		setNumero(conta);
		System.out.println("Agencia: ");
		int agencia = entrada.nextInt();
		setAgencia(agencia);
	}
	
}
