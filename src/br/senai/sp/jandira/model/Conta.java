package br.senai.sp.jandira.model;

public class Conta {
	
	//Atributos  da classe conta
	public String tipo;
	private String numero;
	public String numeroAgencia;
	public String titular;
	private double saldo;
	
	//Construtor de classe Conta 
	public Conta(String numeroConta) {
		numero = numeroConta;
	}
	
	//M�todos da claase Conta
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
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Tipo: %s\n", tipo);
		System.out.printf("Saldo: %s\n", saldo);
	}
	
}
