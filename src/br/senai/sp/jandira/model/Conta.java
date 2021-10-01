package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {
	
	//Atributos  da classe conta
	private TipoConta tipo;
	private String numero;
	private String numeroAgencia;
	public Cliente titular;
	private double saldo;
	
	//Método construtor
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	public void setTipo(TipoConta tipo){
		
		this.tipo = tipo;
		
	}
	
	public TipoConta getTipo(){
		return tipo;
	}
	
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}
	
	//Métodos da classe Conta
	public void depositar(double valorDeposito) {
		
		System.out.println();
		System.out.println("Efetuando Depósito...");
		
		if (valorDeposito > 0) {
			System.out.println("Depósito efetuado com sucesso!");
			saldo += valorDeposito;
		} else {
			System.out.println("Operação Inválida");
		}
	}
	
	public boolean sacar(double valorSaque) {
		
		System.out.println();
		System.out.println("Efetuando Saque...");
		
		if (valorSaque < 0 || valorSaque > saldo) {
			System.out.println("Operação Inválida.");
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
			System.out.println("Não foi possível realizar a transferencia");
		}
		
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("---------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
