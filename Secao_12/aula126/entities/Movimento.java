package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusMovimento;

public class Movimento {

	private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date dataCompra;
	private StatusMovimento statusMovimento;
	private Cliente cliente;

	List<ItemMovimento> lista_itemMovimento = new ArrayList<>();

	// Construtor
	public Movimento() {
	}

	public Movimento(Date dataCompra, StatusMovimento statusMovimento, Cliente cliente) {
		this.dataCompra = dataCompra;
		this.statusMovimento = statusMovimento;
		this.cliente = cliente;
	}

	// get e set
	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public StatusMovimento getStatusMovimento() {
		return statusMovimento;
	}

	public void setStatusMovimento(StatusMovimento statusMovimento) {
		this.statusMovimento = statusMovimento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemMovimento> getLista_itemMovimento() {
		return lista_itemMovimento;
	}

	public void setLista_itemMovimento(List<ItemMovimento> lista_itemMovimento) {
		this.lista_itemMovimento = lista_itemMovimento;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	// Adicionar item
	public void adicionarItem(ItemMovimento itemMovimento) {
		lista_itemMovimento.add(itemMovimento);
	}

	// Remover item
	public void removerItem(ItemMovimento itemMovimento) {
		lista_itemMovimento.remove(itemMovimento);
	}
	
	//Total vanda
	public double total() {
		double soma = 0;
		
		for (ItemMovimento itemMovimento : lista_itemMovimento) {
			soma = soma + itemMovimento.subTotal();
		}
		
		return soma;
	}

	
	//ToString
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("data da compra");
		sb.append(sdf.format(dataCompra));
		sb.append("Status da Compra: ");
		sb.append(statusMovimento + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens movimento:\n");
		for (ItemMovimento itens : lista_itemMovimento) {
			sb.append(itens + "\n");
		}
		sb.append("Total vendas: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
	

}
