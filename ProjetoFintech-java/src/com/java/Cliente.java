package com.java;

public class Cliente {
	
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private String email;
	
	//construtor
	
	public Cliente() {
		
	}
	
	public Cliente(String nome, int idade, String cpf, String rg, String email) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
	}
	

	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
