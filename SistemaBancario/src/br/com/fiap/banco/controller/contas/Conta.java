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
	private double saldo;
	
	//Construtor Padrão da Classe Conta
	public Conta() {}
	
	//Construtor da Classe Conta
	
	/*Gerei esse construtores pelo atalho botão direito ou alt+shift+s source
	 * generate constructor using fields selecione os campos e clique
	 * em generate no caso atual pode apagar o super que vem com o construtor*/
	
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		}
	
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
