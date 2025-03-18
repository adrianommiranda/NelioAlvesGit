package entities;

import java.util.Date;

public class ContratoHora {
	private Date data; 
	private double valorPorHora;
	private int horas;
	
	public ContratoHora() {}
	
	public ContratoHora(Date data, double valorPorHora, int horas) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	public double totalvalor() {
		return horas * valorPorHora;
	}

	@Override
	public String toString() {
		return "ContratoHora [data=" + data + ", valorPorHora=" + valorPorHora + ", horas=" + horas + "]";
	}
	
	
	
}
