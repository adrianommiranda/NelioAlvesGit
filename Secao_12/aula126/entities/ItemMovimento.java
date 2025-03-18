package entities;

public class ItemMovimento {

	private int quantidade;
	private double precoItem;
	private Produto produto;

	// Construtor
	public ItemMovimento() {
	}

	public ItemMovimento(int quantidade, double precoItem, Produto produto) {
		this.quantidade = quantidade;
		this.precoItem = precoItem;
		this.produto = produto;
	}

	// get e set
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	// Subtotal
	public double subTotal() {
		double somaSb = quantidade * precoItem;
		return somaSb;
	}

	@Override
	public String toString() {
		return getProduto().getNome()
				+ " , $" 
				+ String.format("%.2f", precoItem) 
				+", Quantidade: "
				+quantidade
				+",Subtota: $"
				+String.format("%.2f", subTotal()) ;
	}

	
}
