package entities;

import util.Taxas;

public class ClienteBanco {
	private int numeroConra;
	private String nome;
	private double saldo;
		
	//construtor
	public ClienteBanco(int numeroConra, String nome, double depositoInicial) {
		this.numeroConra = numeroConra;
		this.nome = nome;
		depositar(depositoInicial);
	}
	
	public ClienteBanco(int numeroConra, String nome) {
		this.numeroConra = numeroConra;
		this.nome = nome;
		this.saldo = 0;
	}
	
	//Métodos get e set

	public int getNumeroConra() {
		return numeroConra;
	}

	/*public void setNumeroConra(int numeroConra) {
		this.numeroConra = numeroConra;
	}*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	//toString
	@Override
	public String toString() {
		return "ClienteBanco [numeroConra=" + numeroConra + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	
	//Métodos
	public void depositar(double valor) {
		saldo =  saldo + valor;
	}
	
	public void sacar(double valor) {
		saldo =  saldo - valor - Taxas.taxaSaque;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
