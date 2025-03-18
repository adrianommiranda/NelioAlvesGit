package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrdemCompra;

public class Movimentoo {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date dataCompra;
	private OrdemCompra ordemCompra;

	Clientee cliente;
	List<OrdemItem> listasordemItem = new ArrayList<>();

	public Movimentoo(Date dataCompra, OrdemCompra ordemCompra, Clientee cliente) {
		this.dataCompra = dataCompra;
		this.ordemCompra = ordemCompra;
		this.cliente = cliente;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public OrdemCompra getOrdemCompra() {
		return ordemCompra;
	}

	public void setOrdemCompra(OrdemCompra ordemCompra) {
		this.ordemCompra = ordemCompra;
	}

	public Clientee getCliente() {
		return cliente;
	}

	public void setCliente(Clientee cliente) {
		this.cliente = cliente;
	}

	public List<OrdemItem> getListasordemItem() {
		return listasordemItem;
	}

	/*
	 * public void setListasordemItem(List<OrdemItem> listasordemItem) {
	 * this.listasordemItem = listasordemItem; }
	 */

	// adicionar OrdemItem
	public void addItem(OrdemItem item) {
		listasordemItem.add(item);
	}

	// remover OrdemItem
	public void removerItem(OrdemItem item) {
		listasordemItem.remove(item);
	}

	// Total da ordem
	public double total() {
		double soma = 0;
		for (OrdemItem ordemItem : listasordemItem) {
			soma = soma + ordemItem.subTotal();
		}
		return soma;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(dataCompra) + "\n");
		sb.append("Order status: ");
		sb.append(ordemCompra + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (OrdemItem itens : listasordemItem) {
			sb.append(itens + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
