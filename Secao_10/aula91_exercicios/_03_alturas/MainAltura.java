package _03_alturas;

import java.util.Locale;
import java.util.Scanner;

public class MainAltura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		int n;
		double somaaltura=0;
		System.out.println("Entre com o tamanho do vetor");
		n = scanner.nextInt();
		
		Pessoa[] vetor = new Pessoa[n];
				
		for (int i = 0; i < vetor.length; i++) {
			scanner.nextLine();
			System.out.println("Informe o nome do elemento " + (i+1));
			String nome = scanner.nextLine();
			
			System.out.println("Informe a idade do elemento " + (i+1));
			int idade = scanner.nextInt();
			
			System.out.println("Informe a altura do elemento " + (i+1));
			double altura = scanner.nextDouble();
			
			vetor[i] = new Pessoa(nome, idade, altura);
		}
		
		System.out.println("\n\nLendo vetor\n\n");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].toString());
			somaaltura = somaaltura + vetor[i].getAltura();
		}
		
		System.out.println("\n----------Altura média----------\n");
		System.out.println("Altura média: " + somaaltura/vetor.length);
		
		System.out.println("\n----------Idade menor que 16 ----------\n");
		
		int cont=0;
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].toString());
				cont= cont+1;
			}
		}
		
		double percentual = cont * 100.0 /n;
		
		System.out.printf("Percentual de pessoa menores que 16 anos = %.2f%%" , percentual);
	}

}
