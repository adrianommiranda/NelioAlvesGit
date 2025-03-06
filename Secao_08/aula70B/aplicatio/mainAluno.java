package aplicatio;

import java.util.Scanner;

import entities.Aluno;

public class mainAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Aluno a = new Aluno();
		
		System.out.println("Informe o nome do aluno");
		//se a nota for maior que o limite, será computado apenas a nota limite
		
		a.nomeAluno = scanner.nextLine();
		
		
		System.out.println("Informe a primeira nota - max 30");
		double n1 = scanner.nextDouble();
		if(n1 < 0) {
			a.nota1 = 0;
		}else if(n1 > 30) {
			a.nota1 = 30;
		}else {
			a.nota1 = n1;
		}
		
		System.out.println("Informe a segunda nota - max 35");
		double n2 = scanner.nextDouble();
		if(n2 < 0) {
			a.nota2 = 0;
		}else if(n2 > 35) {
			a.nota2 = 35;
		}else {
			a.nota2 = n2;
		}
		
		System.out.println("Informe a terceira nota - max 35");
		double n3= scanner.nextDouble();
		if(n3 < 0) {
			a.nota3 = 0;
		}else if(n3 > 35) {
			a.nota3 = 35;
		}else {
			a.nota3 = n3;
		}
		
		
	
		
		
		
		
		
		
		
		a.resultado();
	}

}
