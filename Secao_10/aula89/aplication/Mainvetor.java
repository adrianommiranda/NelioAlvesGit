package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Mainvetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		double soma = 0;
		double media;
		
		System.out.println("Informe o tamanho do vertor");
		int n =  scanner.nextInt();
		
		double[] vetor = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("informe a altura do aluno " + (i+1) );
			vetor[i] = scanner.nextDouble();
			soma =  soma + vetor[i];
		}

		//lendo vetor
		for(int i=0; i<n; i++) {
			System.out.println(vetor[i]);
		}
		
		//media do vetor
		System.out.println("Média de alunos = " + soma/n);
	}

}
