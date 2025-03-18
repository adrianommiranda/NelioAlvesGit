package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalho;

public class Trabalhador {
	private String nome;
	private NivelTrabalho nivel;
	private double baseSalarial;

	private Departamento departamento;
	private List<ContratoHora> listaContratos = new ArrayList<>();

	public Trabalhador(String nome, NivelTrabalho nivel, double baseSalarial, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalarial = baseSalarial;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public double getBaseSalarial() {
		return baseSalarial;
	}

	public void setBaseSalarial(double baseSalarial) {
		this.baseSalarial = baseSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getListaContratos() {
		return listaContratos;
	}

	/*
	 * public void setListaContratos(List<ContratoHora> listaContratos) {
	 * this.listaContratos = listaContratos; }
	 */

	// adicionar contrato
	public void adicionarContrato(ContratoHora contrato) {
		listaContratos.add(contrato);
	}

	// remover contrato
	public void removerContrato(ContratoHora contrato) {
		listaContratos.remove(contrato);
	}
	
	
	
	

	@Override
	public String toString() {
		return "Trabalhador [nome=" + nome + ", nivel=" + nivel + ", baseSalarial=" + baseSalarial + ", departamento="
				+ departamento + ", listaContratos=" + listaContratos + "]";
	}

	public double valorRecebido(int ano, int mes) {
		double soma = getBaseSalarial();
		Calendar cal = Calendar.getInstance();

		for (ContratoHora contratoHora : listaContratos) {
			//peggar a hora do contrato
			cal.setTime(contratoHora.getData());
			
			int contratoHora_ano = cal.get(Calendar.YEAR);
			int contratoHora_mes = 1 + cal.get(Calendar.MONTH);
			
			if (contratoHora_ano == ano && contratoHora_mes == mes) {
				soma = soma + contratoHora.totalvalor();
			}
		}
		return soma;
	}
}
