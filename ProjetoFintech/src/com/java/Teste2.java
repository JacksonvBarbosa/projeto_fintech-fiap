package com.java;

public class Teste2 {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		Conta cc = new ContaCorrente();
		
		
		//Processo Processo Casting pode fazer tanto um downcating reduzir um classe de super para sub quanto ao contrário  
		ContaCorrente c1 = (ContaCorrente) cc;
		
		//Nesse caso ele só ira executar a condicional se a classe conta for uma instância da outra classe
		if (conta instanceof ContaCorrente) {
			ContaCorrente c2 = (ContaCorrente) conta;
		}
		
		

	}

}
