package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class MainEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome do produto:");
		String nome= scanner.nextLine();
		System.out.println("Preço do produto:");
		double preco = scanner.nextDouble();
		System.out.println("Estoque do produto:");
		int quantidade = scanner.nextInt(); 
			
		Produto p = new Produto(nome, preco, quantidade);
		
		System.out.println("\n\n-----------------------------\n\n");
		System.out.println(p.toString());
		
		p.entradaEstoque(50);
		p.saidaEstoque(10);
		
		System.out.println("\n\n-----------------------------\n\n");
		System.out.println(p.toString());
		
		System.out.println("\n\n-----------------------------\n\n");
		p.dadosPtodutos();
	}

}
