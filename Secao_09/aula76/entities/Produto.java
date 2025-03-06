package entities;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;
	
	//Construtor
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	@Override
	public String toString() {
		 return "Nome do produto = "
				 + nome
				 + "\n$ "
				 + String.format("Preço do produto = %.2f  ", preco)
				 + "\nTotal de unidades = "
				 + quantidade
				 + String.format("\nValor do estoque em mercadorias %.2f ", valorEstoque());
				 
				 
				 
	}
	
	public void dadosPtodutos() {
		System.out.println("Nome = " + nome + 
				           "\nPreço = " + preco + 
				           "\nQuantidade = " + quantidade + 
				           "\nValor total de mercadoria = " + valorEstoque());
	}

	public int entradaEstoque(int qtd) {
		this.quantidade = quantidade + qtd;
		return this.quantidade;
	}
	
	public int saidaEstoque(int qtd) {
		this.quantidade = quantidade - qtd;
		return this.quantidade;
	}
	
	public double valorEstoque() {
		double total = this.preco * this.quantidade;
		return total;
	}
	
}
