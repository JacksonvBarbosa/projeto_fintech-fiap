package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	private static final long serialVersionUID = 1L;

	//atributos
	private double deposito;
	private double saque;
	private double saldo;
	private double chequeEspecial;
	
	
	//construtor
	public ContaCorrente() {
		
	}
	
	//metodos
	public void efetuarDeposito() {
		saldo += deposito;
	}
	
	//public void efetuarSaque() {
		//saldo -= saque;
	//}

	//método getters and setters
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


	public double getChequeEspecial() {
		double valor = 0;
		if (saque > 0) {
			valor = saque + 10;
		}
		return valor;
	}
	
	public double getSaldo() {
		return saldo -= getChequeEspecial();
	}
	
	
}
