package com.java;

public class TesteInvestimento {

	public static void main(String[] args) {
		
		ContaInvestimento conta = new ContaInvestimento();
		
		conta.depositar(20000);
		System.out.println("Saldo Investimento: R$ " + conta.getSaldoInvestimento());
		conta.setTipo(false);
		
		conta.setRendaFixa(5000);
		System.out.println("Valor investido em sua conta foi de R$ " +  conta.getRendaFixa());
		System.out.println("Saldo Renda Fixa: R$ " + conta.getSaldoRendaFixa());
		System.out.println("Saldo atual do Investimento: R$ " + conta.getSaldoInvestimento());
		
		conta.setRendaVariavel(5000);
		System.out.println("Valor investido em sua conta foi de R$ " +  conta.getRendaVariavel());
		System.out.println("Saldo Renda Variavel: R$ " + conta.getSaldoRendaVariavel());
		System.out.println("Saldo atual do Investimento: R$ " + conta.getSaldoInvestimento());
	}

}
