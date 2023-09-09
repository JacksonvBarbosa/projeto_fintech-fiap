package br.com.fiap.banco;

import java.io.Serializable;

public class ContaPoupanca extends Conta {

	private static final long serialVersionUID = 1L;
	
	//atributos
	private double deposito;
	private double saque;
	private double saldo;
	private double rendimento;
	private double taxaDeJurosAnual = 0.06; // Taxa de juros anual (6%)
	private int anos;
	
	//construtor
	public ContaPoupanca() {}
	
	
	//metodos
	public void efetuarDeposito() {
		saldo += deposito;
	}
	
	/*public void efetuarSaque() {
		if (saldo >= saque) {
			saldo -= saque;
		} else {
			System.out.println("Saldo Indisponível");
		}
	}*/

	
	//getters and setters
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
		if (saldo >= saque) {
			this.saque = saque;
			saldo -= saque;
		} else {
			System.out.println("Saldo Indisponível");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public double getRendimento() {
		double montante = saldo * Math.pow(1 + (taxaDeJurosAnual / 1), 1 * anos);
		double resultadoRendimento = montante - saldo;
		return rendimento = resultadoRendimento;
	}
	
	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}
	
	public double exibirSaldoRendimento() {
		double saldoRendimento;
		return saldoRendimento = getRendimento() + saldo;
	}
	
	
}
