package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;



public class Conta {
	
	//Atributos  da classe conta
	private TipoConta tipo;
	private String numero;
	private Agencia agencia;
	private Cliente titular;
	private double saldo;
	
	//M�todo construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	//M�todos de acesso
	
	public void setTipo(TipoConta tipo){
		
		this.tipo = tipo;
		
	}
	
	public TipoConta getTipo(){
		return tipo;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public Agencia getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	//M�todos da classe Conta
	public void depositar(double valorDeposito) {
		
		System.out.println();
		System.out.println("Efetuando Dep�sito...");
		
		if (valorDeposito > 0) {
			System.out.println("Dep�sito efetuado com sucesso!");
			saldo += valorDeposito;
		} else {
			System.out.println("Opera��o Inv�lida");
		}
	}
	
	public boolean sacar(double valorSaque) {
		
		System.out.println();
		System.out.println("Efetuando Saque...");
		
		if (valorSaque < 0 || valorSaque > saldo) {
			System.out.println("Opera��o Inv�lida.");
			return false;
		} else {
			System.out.println("Saque efetuado com sucesso!");
			saldo -= valorSaque;
			return true;
		}
	}
	
	public void transferir(Conta contaDestino, double valorTransferencia) {
		
		boolean resultado = sacar(valorTransferencia);
		
		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel realizar a transferencia");
		}
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular.getNome());
		System.out.printf("E-mail: %s\n", titular.getEmail());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", agencia.getNumero());
		System.out.printf("Gerente: %s\n", agencia.getGerente());
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
