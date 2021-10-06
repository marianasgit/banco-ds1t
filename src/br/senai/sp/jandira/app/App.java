package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;
import br.senai.sp.jandira.model.Agencia;

public class App {

	public static void main(String[] args) {
		
		//Criando agencia
		Agencia agencia = new Agencia();
		agencia.setNumero("4214-9");
		agencia.setGerente("João Carvalho");
		agencia.setTelefone("0800 123 456");
		agencia.setCidade("Jandira");
		
		//Criar o cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria da Silva"); 
		clienteMaria.setEmail("maria@terra.com.br");
		clienteMaria.setSalario(2000);
		
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setTitular(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		//Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral"); 
		clientePedro.setEmail("pedro@ig.com.br");
		clientePedro.setSalario(1500);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setTitular(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agencia);
		
		//Criar o cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes"); 
		clienteAna.setEmail("ana@zaz.com.br");
		clienteAna.setSalario(1900);
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setTitular(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agencia);
		
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println("===========TRANSFERENCIAS===========");
		
		// Depositar 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		
		// Sacar 300 reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		// Depositar -200 reais na conta do Pedro
		contaPedro.depositar(200);
		contaPedro.exibirDetalhes();
		
		// Sacar -100 reais da conta da Maria
		contaMaria.sacar(-300);
		contaMaria.exibirDetalhes();
		
		// Tranferir 100 reais da conta do Pedro para a conta da Maria
		contaPedro.transferir(contaMaria, -150);
		contaPedro.exibirDetalhes();
		contaMaria.exibirDetalhes();
		
		System.out.println("====================================");
		

	}

}
