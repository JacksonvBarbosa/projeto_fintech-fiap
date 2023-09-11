package br.com.fiap.banco.application;

import java.util.Scanner;

import br.com.fiap.banco.controller.contas.Conta;
import br.com.fiap.banco.controller.contas.ContaCorrente;
import br.com.fiap.banco.controller.contas.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		// Instanciar Scanner
		Scanner selecione = new Scanner(System.in);


		while (true) {
			System.out.printf(
					"Selecione uma Opção!\n" + "1 - Conta Poupança.\n" + "2 - Conta Corrente\n" + "3 - Rendimento.\n" + "4 - Sair do Aplicativo");
			int sel = selecione.nextInt();

			if (sel == 1) {
				
				cp.acessarContaPoupanca();
				
			} else if (sel == 2) {
				
				cc.acessarContaCorrente();

			} else if (sel == 3) {
				
				cp.exibirSaldoRendimento();
				
			} else if(sel == 4) {
				
				System.out.println("Obrigado por utilizar nosso App!");
				break;
				
			}

		}

	}

}
