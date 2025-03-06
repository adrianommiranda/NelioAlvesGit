package entities;

public class Funcionario {
	public String nome;
	public double salario;
	public double imposto;
	
	
	@Override
	public String toString() {
		return "nome = " + nome
				+ String.format("\nSalario = $ %.2f", salario)
				+ String.format("\nImposto = $ %.2f", imposto)
				+ String.format("\nSalário líquido = $"
				+this.sLiquido());
	}
	
	public void salarioLiquido() {
		double liquido = this.salario - this.imposto;
	}
	
	public double sLiquido() {
		double liquido = this.salario - this.imposto;
		return liquido;
	}
	
	public double aumentoSalario(double aumento) {
		this.salario =  this.salario + aumento;
		return salario;
	}
	
}
