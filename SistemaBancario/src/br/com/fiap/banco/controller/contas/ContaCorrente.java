package br.com.fiap.banco.controller.contas;

import java.util.Scanner;

public class ContaCorrente extends Conta {

	private static final long serialVersionUID = 1L;

	//atributos
	private double saldo;
	private double chequeEspecial;
	
	Scanner op = new Scanner(System.in);
	
	
	//construtor
	public ContaCorrente() {
		
	}
	
	//Getters and Setters
	
	public double getChequeEspecial() {
		return chequeEspecial = 10;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// Métodos
	public void acessarContaCorrente() {
		System.out.println("Seja bem vindo(a) a sua Conta Corrente\n");
		setarContaAgencia();
		while (true) {
			System.out.printf("Olá!\n " + "1 - Deposito.\n " + "2 - Saque.\n " + "3 - Saldo\n " + "4 - Sair.\n ");

			System.out.println("Digite sua opção: ");
			int opcao = op.nextInt();

			// condicional
			if (opcao == 1) {
				System.out.println("Deposito: R$ ");
				double dep = op.nextDouble();
				setDeposito(dep);
				saldo += dep;
				System.out.println("Deposito executado: R$ " + dep);

			} else if (opcao == 2) {
				System.out.println("Saque: R$ ");
				double sq = op.nextDouble();
				setSaque(sq);

				if (saldo >= getSaque()) {
					saldo -= getSaque();
					System.out.println("Saque executado: R$ " + sq);
				} else {
					System.out.println("Deseja solicitar o cheque especial?");
					String solicita = op.next();
					solicita.toUpperCase();
					if(solicita.equalsIgnoreCase("SIM") ) {
						requisitarChequeEspecial();
						System.out.println("Saque executado: R$ " + sq);
						System.out.println("Cheque Especial: R$ " + "-" + getChequeEspecial());
					} 
				}

			} else if (opcao == 3) {
				System.out.printf("Saldo Atual: R$ %.2f\n", getSaldo());
			} else if (opcao == 4) {
				break;
			}
		}
	}
	
	public void requisitarChequeEspecial() {
			double valor = getSaque() + getChequeEspecial();
			saldo -= valor;
	}
	
	
}
