package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Cotacao;

public class MainCotacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a cotação do dollar");
		double cotacaoDolar = scanner.nextDouble();
		
		System.out.println("Informe um valor em dollar a ser comprado");
		double compraDolar = scanner.nextDouble();
		
		double resultado = Cotacao.converterDollarParaReal(cotacaoDolar, compraDolar);
		
		System.out.printf("Precisa de $ %.2f ", resultado);
		
		scanner.close();
		
	}

}
