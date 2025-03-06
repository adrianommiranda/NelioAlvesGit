package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula27 {

	public static void main(String[] args) {
		// Entrada de dados
		Scanner scanner = new Scanner(System.in);

		System.out.println("Idade");
		int idade = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Digine o seu nome e sobrenome");
		String nome = scanner.nextLine();

		System.out.println("Sobrenome");
		String sobre = scanner.nextLine();

		System.out.printf("Dados %d %s %s ", idade, nome, sobre);

	}

}
