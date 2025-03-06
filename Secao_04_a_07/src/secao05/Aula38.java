package secao05;

import java.util.Locale;
import java.util.Scanner;

public class Aula38 {

	public static void main(String[] args) {
		/*
		 * Exercícios if-else
		 * 
		 * Uma operadora de telefonia cobra R$ 50.000 por um plano básico que dá direito
		 * a 100 minutos de telefone. Cada minutobque exceder a franquia de 100 minutos
		 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
		 * pessoa consumiu, daí ostrar o valor a ser pago
		 * 
		 * exemplo 22min - 50 reais 103 min - 56 reais
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int minExcedentes, entrada;
		double valorpago = 50;
		double valorMin = 2;
		double vTotal;

		System.out.println("Informe o valor de min consumidos!");
		entrada = scanner.nextInt();
		scanner.nextLine();

		if (entrada <= 100) {
			System.out.printf("Valor a ser pago é de %.2f\n", valorpago);
		} else {
			// Descobrir quandidade de min excedentes
			minExcedentes = entrada - 100;

			// Vaor pago por minuto
			valorMin = minExcedentes * valorMin;

			// Total da faatura
			vTotal = valorpago + valorMin;

			System.out.printf("você teve %d excedentes. Valor dos min excedente %.2f Sua fatura é de %.2f\n",
					minExcedentes, valorMin, vTotal);
		}

	}

}
