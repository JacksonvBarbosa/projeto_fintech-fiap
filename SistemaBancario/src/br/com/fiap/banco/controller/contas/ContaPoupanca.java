package br.com.fiap.banco.controller.contas;

import java.io.Serializable;
import java.util.Scanner;

public class ContaPoupanca extends Conta {

	private static final long serialVersionUID = 1L;

	// atributos
	private double saldo;
	private double rendimento;
	private double taxaDeJurosAnual = 0.06; // Taxa de juros anual (6%)
	private int anos;

	Scanner op = new Scanner(System.in);

	// construtor
	public ContaPoupanca() {
	}

	//Getters and Setters
	public double getSaldo() {
		return saldo;
	}

	public double getRendimento() {
		return rendimento;
	}

	public int getAnos() {
		return anos;
	}

	public void setAnos(int anos) {
		this.anos = anos;
	}

	// Métodos
	public void acessarContaPoupanca() {
		System.out.println("Seja bem vindo(a) a sua Conta Poupança\n");
		setarContaAgencia();
		while (true) {
			// menu
			System.out.printf("Olá!\n " + "1 - Deposito.\n " + "2 - Saque.\n " + "3 - Saldo\n " + "4 - Sair.\n ");

			System.out.println("Digite sua opção: ");
			int opcao = op.nextInt();

			// conficional
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
					System.out.println("Saldo Indisponível!");
				}
			} else if (opcao == 3) {
				System.out.printf("Saldo Atual: R$ %.2f\n", getSaldo());
			} else if (opcao == 4) {
				break;
			}
		}
	}

	public void exibirSaldoRendimento() {
		double saldoRendimento;

		System.out.println("Seja bem vindo(a) aos seus rendimentos!\n");
		while (true) {
			System.out.printf("Olá!\n " + "1 - Adicionar Anos\n " + "2 - Consultar Rendimento\n " + "3 - Sair\n ");
			int escolha = op.nextInt();

			if (escolha == 1) {

				System.out.println("Veja quantos rendeu seu dinheiro!\n");
				System.out.println("Anos: ");
				int anual = op.nextInt();
				setAnos(anual);
				double montante = saldo * Math.pow(1 + (taxaDeJurosAnual / 1), 1 * anos);
				double resultadoRendimento = montante - saldo;
				rendimento = resultadoRendimento;

			} else if (escolha == 2) {

				saldoRendimento = saldo + rendimento;
				System.out.printf("Rendimento de %d anos: R$ %.2f\n", getAnos(), getRendimento());
				System.out.printf("Saldo com rendimento: R$ %.2f\n", saldoRendimento);

			} else if (escolha == 3) {
				break;

			}
		}
	}

}
