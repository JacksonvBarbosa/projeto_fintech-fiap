package br.com.fiap.banco;

public class Telefone {
	
	private String ddd;
	private String numero;
	
	public Telefone() {}
	
	//métodos gets e sets
	
	public String getTelefoneFormatado() {
		return formatarTelefone(ddd, numero);
	}
	
	private String formatarTelefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
		return "(" + ddd + ")" + numero;
	}
	
	

}
