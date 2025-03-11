package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class appLista3 {

	public static void main(String[] args) {
		Empregado empregado;
		List<Empregado> lista = new ArrayList<>();
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

		// procurar id na função
		Integer pos = retornaPosicao(lista, entradaId);
		if (pos == null) {
			System.out.println("ID inesistente!!");
		} else {
			System.out.println("Informe o percentual de aumento");
			double perct = scanner.nextDouble();
			lista.get(pos).aumento(perct);
		}

		System.out.println("\n\n");

		for (Empregado listaEmpregado : lista) {
			System.out.println(listaEmpregado.toString());
		}

	}

	public static Integer retornaPosicao(List<Empregado> lista, int id) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}

}
