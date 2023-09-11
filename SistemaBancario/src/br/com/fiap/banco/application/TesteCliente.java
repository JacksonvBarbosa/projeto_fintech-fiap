package br.com.fiap.banco.application;

import java.util.Scanner;

import br.com.fiap.banco.Pessoa;
import br.com.fiap.banco.model.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		//Instâncias
		Cliente cliente = new Cliente();
		
		System.out.println("Dados Pessoais para o Banco de Dados de cada pessoa");
		cliente.obterDadosPessoais();
		cliente.exibirDadosPessoais();
		
		
		System.out.println("Dados do Cliente para o Banco de Dados da conta bancária");
		cliente.obterDadosCliente();
		cliente.exibirDadosCliente();

	}

}
