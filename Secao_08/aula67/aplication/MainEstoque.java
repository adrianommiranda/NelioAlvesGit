package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class MainEstoque {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		
		Produto p = new Produto(); 
		
		
		//p.nome= "Bola";
		//p.preco = 500;
		//p.quantidade = 100; 
		
		System.out.println("Nome do produto:");
		p.nome= scanner.nextLine();
		System.out.println("Preço do produto:");
		p.preco = scanner.nextDouble();
		System.out.println("Estoque do produto:");
		p.quantidade = scanner.nextInt(); 
				
		
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
