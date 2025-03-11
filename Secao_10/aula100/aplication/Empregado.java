package aplication;

public class Empregado {
	private int matricula;
	private int id;
	private String nome;
	private double salario;
	
	
	
	public Empregado(int matricula, int id, String nome, double salario) {
		this.matricula = matricula;
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumento(double percentual) {
		double aumentoReal = (salario * percentual)/100;
		return salario = getSalario() + aumentoReal;
		
	}
	
	@Override
	public String toString() {
		return "Matricula: " + this.matricula + "      Id: " + this.id + 
				"     Nome: " + this.nome + "     Salário: " + this.salario;
	}
	
	
	
}


