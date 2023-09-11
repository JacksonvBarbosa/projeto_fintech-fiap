package br.com.fiap.banco.model;

import java.util.Scanner;

import br.com.fiap.banco.controller.contas.Conta;
import br.com.fiap.banco.controller.contas.ContaCorrente;

public class Cliente extends Pessoa {
	

	//Intanciar
	Scanner dados = new Scanner(System.in);
	
	private static final long serialVersionUID = 1L;
	
	//atributos
	private int registro;
	private String email;
	private int telefone;	
	
	//Getters and Setters
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	//Métodos
	public void obterDadosPessoais() {
		
		System.out.println("Nome: ");
		String nome = dados.next();
		setNome(nome);
		System.out.println("Data de Nascimento: ");
		int dtNascimento = dados.nextInt();
		setDtNascimento(dtNascimento);
		System.out.println("Idade: ");
		int idade = dados.nextInt();
		setIdade(idade);
		System.out.println("CPF: ");
		String cpf = dados.next();
		setCpf(cpf);
		System.out.println("Genêro: ");
		String genero = dados.next();
		setGenero(genero);
	}
	
	public void exibirDadosPessoais() {
		System.out.printf("Nome: %s\n", getNome());
		System.out.printf("Data de Nascimento: %d\n", getDtNascimento());
		System.out.printf("Idade: %d\n", getIdade());
		System.out.printf("CPF: %s\n", getCpf());
		System.out.printf("Genêro: %s\n", getGenero());
	}
	
	public void obterDadosCliente() {
		System.out.println("Registrar: ");
		int reg = dados.nextInt();
		setRegistro(reg);
		System.out.println("E-mail: ");
		String em = dados.next();
		setEmail(em);
		System.out.println("Telefone: ");
		int tel = dados.nextInt();
		setTelefone(tel);
	}
	
	public void exibirDadosCliente() {
		System.out.printf("Nome: %s\n", getNome());
		System.out.printf("Registro do Cliente: %d\n", getRegistro());
		System.out.printf("E-mail: %s\n", getEmail());
		System.out.printf("Telefone: %d\n", getTelefone());
		
	}
}
