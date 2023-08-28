package com.java;

public class TesteConta {
	
	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		/*conta1.depositar(1000);
		conta1.retirar(100);
		
		
		
		ContaCorrente conta2 = new ContaCorrente();
		conta2.depositar(1000);
		conta2.retirar(100);
		
		
		
		Conta conta3 = new ContaCorrente();
		conta3.depositar(1000);
		conta3.retirar(100);
		
		
		System.out.println("Conta1: R$ " + conta1.getSaldo());
		System.out.println("Conta2: R$ " + conta2.getSaldo());
		System.out.println("Conta3: R$ " + conta3.getSaldo());*/
		
		conta1.depositar(1000);
		conta1.setChequeEspecial(5000);
		System.out.println("Saldo + Cheque Especial: R$ " + conta1.getSaldo() + " + " + conta1.getChequeEspecial() + " \nTotal:  R$ " + conta1.getSaldoDisponivel());
		System.out.println("Saldo: R$ " + conta1.getSaldo());
	
	}

}
