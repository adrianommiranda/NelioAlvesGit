package aplicarion;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class mainFunc {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		Funcionario f = new Funcionario();
		
		System.out.println("Entre com o nome do funcionário");
		f.nome = scanner.nextLine();
		System.out.println("Entre com o salário");
		f.salario = scanner.nextDouble();
		System.out.println("Entre com o desconto");
		f.imposto = scanner.nextDouble();
		
		System.out.println("\n\n");
		System.out.println(f.toString());

		System.out.println("\n\n");
		System.out.println("Informe o aumento do salário");
		double aumento = scanner.nextDouble();
		f.aumentoSalario(aumento);
		
		System.out.println("\n\n");
		System.out.println(f.toString());
	}

}
