package _02_soma_vetor;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		int n;
		int soma=0;
		int media;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o tamanho do vetor");
		n = scanner.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Informe o elemento " + (i + 1) + " = ");
			vetor[i] = scanner.nextInt();

		}

		System.out.println("\n\nDados armazenados no vetor\n");

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			soma = soma + vetor[i];
		}
		
		media =  soma/vetor.length;
		
		System.out.println("\n\nA soma dos valorres é " + soma 
						  + "\nA media dos valores é  " + media);
	}

}
