package _02_numeros_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main_numeros_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int somaPar = 0;
				
		System.out.println("Informe o tamanho do vetor");
		int n = scanner.nextInt();
		
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = scanner.nextInt();
		}

		System.out.println("\n\nTodos valores do vetor\n");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("\n\nsomente valores pares\n");
		for (int i = 0; i < vetor.length; i++) {
			if(vetor[i]%2==0) {
				System.out.println(vetor[i]);
				somaPar = somaPar +1;
			}
		}
		
		System.out.println("\n\nTotal de números pares = " + somaPar);
		
	}

}
