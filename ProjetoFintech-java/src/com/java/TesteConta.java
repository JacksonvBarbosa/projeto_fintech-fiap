package com.java;

import java.util.Scanner;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Valor de Deposito: R$ ");
		double deposito = entrada.nextDouble();
		conta1.depositar(deposito);

		System.out.println("Valor de Retirada: R$ ");
		double retirada = entrada.nextDouble();
		conta1.retirar(retirada);

		conta1.setChequeEspecial(5000);
		System.out.println("Saldo + Cheque Especial: R$ " + conta1.getSaldo() + " + " + conta1.getChequeEspecial()
				+ " \nTotal:  R$ " + conta1.getSaldoDisponivel());
		System.out.println("Saldo: R$ " + conta1.getSaldo());
	}
}
