package aplications;

import java.util.Scanner;

import entities.ClienteBanco;

public class Banco {

	public static void main(String[] args) {
		ClienteBanco cb;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Número da conta");
		int conta = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nome do cliente");
		String nome = scanner.nextLine();
		
		
		System.out.println("vai ter depósito inicial s/n");
		char resp = scanner.nextLine().charAt(0);
		if(resp == 's') {
			System.out.println("Informe o valor do depósito inicial");
			double depositoInicial = scanner.nextDouble();
			 cb = new ClienteBanco(conta, nome, depositoInicial);
		}else {
			cb = new ClienteBanco(conta, nome);
		}
		
		
		System.out.println("\n\n-------------- Dados do cliente -----------------\n\n");
		System.out.println(cb.toString());
		
		System.out.println("\n\n-------------- Depósito do cliente ----------------\n\n");
		System.out.println("Entre com o valor a depositar");
		double valor =  scanner.nextDouble();
		cb.depositar(valor);
		
		System.out.println("\n\n-------------- Dados do cliente -----------------\n\n");
		System.out.println(cb.toString());
		
		System.out.println("\n\n-------------- Saque do cliente ----------------\n\n");
		System.out.println("Entre com o valor a sacar");
		valor =  scanner.nextDouble();
		cb.sacar(valor);
		
		System.out.println("\n\n-------------- Dados do cliente -----------------\n\n");
		System.out.println(cb.toString());
	}

}
