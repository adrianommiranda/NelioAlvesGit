package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class appLista {

	public static void main(String[] args) {
		Empregado empregado; 
		List<Empregado> lista =  new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe quantas clientes irá cadastrar?");
		int qtd = scanner.nextInt();
		
		for (int i = 0; i < qtd; i++) {
			int matricula = i;
			System.out.println("Entre com o ID");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Entre com o nome");
			String nome = scanner.nextLine();
			System.out.println("Entre com o salário");
			double salario = scanner.nextDouble();
			
			empregado = new Empregado(matricula, id, nome, salario);
			
			lista.add(empregado);
			
		}
		
		System.out.println("\n\n");
		
		for (Empregado listaEmpregado : lista) {
			System.out.println(listaEmpregado.toString());
		}
		
		
		System.out.println("\n\n");
		
		System.out.println("Informe o id que vai receber o aumento");
		int entradaId = scanner.nextInt();
		
		Empregado listaEmp = lista.stream().filter(x -> x.getId() == entradaId).findFirst().orElse(null);
		if(listaEmp == null) {
			System.out.println("Id não encontrado");
		}else{
			System.out.println("Informe o percentual de aumento");
			double perct = scanner.nextDouble();
			listaEmp.aumento(perct);
		}
		
		System.out.println("\n\n");
		
		for (Empregado listaEmpregado : lista) {
			System.out.println(listaEmpregado.toString());
		}

	}

}
