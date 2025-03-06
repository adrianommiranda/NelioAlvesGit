package secao04;

import java.util.Locale;

public class Aula24 {

	public static void main(String[] args) {

		// Saída de dados em java

		// println
		System.out.println("Quebando linha");

		// print
		System.out.print("Sem quebrar linha ");
		System.out.print("Continua na mesma inha \n");

		// variável com concatenação
		int n = 32;
		double d = 700.782;
		System.out.println("variável inteira - " + n);
		System.out.println("variável double - " + d);

		// controlando as casas decimais - printf
		System.out.printf("Duas casas %.2f\n", d);
		System.out.printf("4 cadas decimais %.4f\n", d);

		// trocando o , pelo pomto, locação US
		Locale.setDefault(Locale.US);

		// Trocou , pelo .
		System.out.printf("Duas casas %.2f\n", d);
		System.out.printf("4 cadas decimais %.4f\n", d);

		// concatenando com printf ponto flutuando %f string %s inteiro %d quebra de
		// linha %n
		String nome = "Adriano";
		int idade = 40;
		char sexo = 'M';
		double salario = 50.000;
		System.out.printf("Bem vindo %s . Seu sexo é do tipo %s , idade de %d com salario de %.3f\n ", nome, sexo,
				idade, salario);

	}

}
