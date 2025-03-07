package _01_negativos;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		int n;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor");
		n = scanner.nextInt();
		
		int[] vetor =  new int[n];
		
		for(int i=0; i<vetor.length; i++) {
			System.out.print("Informe o elemento " + (i+1) + " = ");
			vetor[i] = scanner.nextInt();
			
		}
		
		System.out.println("\n\nApenas os números negativos\n");
		
		for(int i=0; i<vetor.length; i++) {
			if(vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
			
		}
		
	}

}
