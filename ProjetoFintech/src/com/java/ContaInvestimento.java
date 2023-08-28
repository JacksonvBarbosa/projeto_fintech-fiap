package com.java;

import java.io.ObjectInputStream.GetField;

public class ContaInvestimento extends Conta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean tipo;
	private double rendaFixa;
	private double rendaVariavel;
	private double saldoInvestimento;
	private double saldoRendaFixa;
	private double saldoRendaVariavel;
	
	//Contrutores Gets and Sets
	public boolean getTipo() {
		return tipo;
	}
	
	public void setTipo(boolean tipo) {
		if(tipo == true) {
			System.out.println("Bem vindo(a) a sua Renda fixa");
		} else {
			System.out.println("Bem vindo(a) a sua Renda Variavel!");
		}
	}
	
	public double getRendaFixa() {
		return rendaFixa;
	}
	
	
	public void setRendaFixa(double rendaFixa) {
		
		if (saldoInvestimento > 0 && tipo == true) {
			this.rendaFixa = rendaFixa;
			this.saldoInvestimento -= rendaFixa;
		}
	}
	
	public double getRendaVariavel() {
		return rendaVariavel;
	}
	
	public void setRendaVariavel(double rendaVariavel) {
		
		if (saldoInvestimento > 0 && tipo == false) {
			this.rendaVariavel = rendaVariavel;
			this.saldoInvestimento -= rendaVariavel;
		}
	}
	
	public double getSaldoRendaFixa() {
		return saldoRendaFixa += getRendaFixa();
	}
	
	//public void setSaldoRendaFixa(double setSaldoRendaFixa) {
		//this.saldoRendaFixa += rendaFixa;
	//}	
	
	public double getSaldoRendaVariavel() {
		return saldoRendaVariavel += getRendaVariavel();
	}

	//public void setSaldoRendaVariavel(double saldoRendaVariavel) {
		//this.saldoRendaVariavel = saldoRendaVariavel;
	//}

	public double getSaldoInvestimento() {
		return this.saldoInvestimento;
	}
	
	//Métodos
	
	
	/*public void depositar() {
		if (saldoInvestimento > 0) {
			super.depositar(rendaFixa);
		} else {
			System.out.println("Sem saldo em conta!");
		}
	}*/

	
	@Override
	public void depositar(double investimento) {
		this.saldoInvestimento += investimento;
	}
	

}
