package aplication;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class MainProd {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double soma = 0;
		double media;
		System.out.println("Informe o tamanho do vetor");
		int n = scanner.nextInt();
		
		
		//cria o vetor
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) {
			scanner.nextLine();
			String nome =  scanner.nextLine();
			double preco = scanner.nextDouble();
			
			vetor[i] = new Produto(nome, preco);
		}
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i].toString());
			soma = soma + vetor[i].getPreco();
		}
		
		media =  soma/vetor.length;
		
		System.out.println("Media dos preços é = " + media);
	}

}
