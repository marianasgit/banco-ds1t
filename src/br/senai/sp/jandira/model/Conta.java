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
	
	//Métodos da claase Conta
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
