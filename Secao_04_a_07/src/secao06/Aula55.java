package secao06;

import java.util.Scanner;

public class Aula55 {

	public static void main(String[] args) {
		// Estrutura repetitiva faça-enquanto (do-while)
		
		
		int i=10;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
		System.out.println("\n\n--------------------------\n\n");

		Scanner scanner = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Olá");
			System.out.println("informe a sua resposta");
			resp = scanner.next().charAt(0);
		} while (resp != 'n' );
	}

}
