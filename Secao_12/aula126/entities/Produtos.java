package entities;

import java.util.Date;

public class Produtos {
	
	private String nomeProduto;
	private double preco;
	
	//Construtor
	public Produtos() {}
	
	public Produtos(String nomeProduto, double preco) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	//Get e set
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	//To String
	@Override
	public String toString() {
		return "Produtos [nomeProduto=" + nomeProduto + ", preco=" + preco + "]";
	}
	
	
}
