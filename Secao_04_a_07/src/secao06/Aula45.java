package secao06;

import java.util.Scanner;

public class Aula45 {

	public static void main(String[] args) {
		//Estrutura while
		
		System.out.println("Exemplo 2     -    Faça um laço de 0 a 5 \n");
		int i=0;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("\n\n------------------------------------------\n\n");

		
		System.out.println("Exemplo 2     -    Faça um laço de quando digitar 0 saia. \n");
		Scanner scanner = new Scanner(System.in);
		int j;
		int soma =0;
		j = scanner.nextInt();
		while(j!=0) {
			System.out.println("Informa um número");
			soma =  soma + j;
			j = scanner.nextInt();
			
		}
		
		System.out.println("Soma é " + soma);
		System.out.println("\n\n------------------------------------------\n\n");

	}

}
