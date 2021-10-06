package br.senai.sp.jandira.model;

public class Agencia {
	
	private String numero;
	private String gerente;
	private String telefone;
	private String cidade;
	
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	public String getGerente() {
		return this.gerente;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
}
