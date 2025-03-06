package entities;

public class Aluno {
	public String nomeAluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNota() {
		double sNota = nota1 + nota2 + nota3;
		return sNota;
	}
	
	public void resultado() {
		if(somaNota() >= 60.00) {
			System.out.printf("O aluno %s foi aprovado com nota %.2f", nomeAluno, somaNota());
		}else {
			double falta = 60.00 - somaNota();
			System.out.printf("O aluno %s foi reprovado com nota %.2f. Faltou %.2f para ele passar", nomeAluno, somaNota(), falta);
		}
	}
	
}
