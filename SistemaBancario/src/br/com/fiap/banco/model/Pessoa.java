package br.com.fiap.banco.model;

import java.io.Serializable;

/*Serializable transforma a Classe pessoa em um pacote de bits para que
 * sejam trafegado pela rede*/

public class Pessoa implements Serializable {
	
	/**
	 * Especifica pessoa para essa classe especificamente
	 * 
	 */
	//atributos
	private static final long serialVersionUID = 1L;
	private String nome;
	private int dtNascimento;
	private int idade;
	private String cpf;
	private String genero;
	
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(int dtNascimento) {
		this.dtNascimento = dtNascimento;
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
