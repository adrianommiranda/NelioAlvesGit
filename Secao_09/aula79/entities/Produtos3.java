package entities;

public class Produtos3 {
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor
	public Produtos3(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// Construtor
	public Produtos3(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 0;
	}

	/// métodos get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	/*public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}*/

	
	//Métodos toString
	@Override
	public String toString() {
		return "Nome do produto = " + nome + "\n$ " + String.format("Preço do produto = %.2f  ", preco)
				+ "\nTotal de unidades = " + quantidade
				+ String.format("\nValor do estoque em mercadorias %.2f ", valorEstoque());

	}

	
	//Outros métodos
	public void dadosPtodutos() {
		System.out.println("Nome = " + nome + "\nPreço = " + preco + "\nQuantidade = " + quantidade
				+ "\nValor total de mercadoria = " + valorEstoque());
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
