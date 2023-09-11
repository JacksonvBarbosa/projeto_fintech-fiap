package br.com.fiap.banco;

import java.io.Serializable;

/*Serializable transforma a Classe pessoa em um pacote de bits para que
 * sejam trafegado pela rede*/

public class Pessoa implements Serializable {
	
	/**
	 * Especifica pessoa para essa classe especificamente
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	private String email;
	
	
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
	

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
