package secao04;

import java.util.Locale;
import java.util.Scanner;

public class Aula26 {

	public static void main(String[] args) {
		// Entrada de dados
		System.out.println("Digine o seu nome");
		String nome;

		Scanner scanner = new Scanner(System.in);
		nome = scanner.next();
		System.out.println(nome);

		System.out.println("Salario");
		double salario;

		// Trocando . pela ,
		Locale.setDefault(Locale.US);
		salario = scanner.nextDouble();
		System.out.println(salario);

		System.out.printf("%.2f", salario);

		// lendo cacacter
		System.out.println("Sexo");
		char sexo;
		sexo = scanner.next().charAt(0); // charAt(0) - pega primeiro caracter da string
		System.out.println(sexo);

	}

}
