package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos3;

public class MainEstoque3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome do produto:");
		String nome= scanner.nextLine();
		System.out.println("Preço do produto:");
		double preco = scanner.nextDouble();
		
		scanner.nextLine();
		
			
		Produtos3 p = new Produtos3(nome, preco);
		
		System.out.println("\n\n-----------------------------\n\n");
		System.out.println(p.toString());
		
		p.entradaEstoque(50);
		p.saidaEstoque(10);
		
		System.out.println("\n\n-----------------------------\n\n");
		System.out.println(p.toString());
		
		System.out.println("\n\n-----------------------------\n\n");
		p.dadosPtodutos();
		
		System.out.println("\n\n-----------------------------\n\n");
		System.out.println("Alterando o nome do produto");
		String nomeAlterado =  scanner.nextLine();
		p.setNome(nomeAlterado);
		
		System.out.println("\n\nNovo nome: " + p.getNome());

	}

}
