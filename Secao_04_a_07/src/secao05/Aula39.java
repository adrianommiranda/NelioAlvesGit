package secao05;

import java.util.Scanner;

public class Aula39 {

	public static void main(String[] args) {
		// Estrutura switch - case

		Scanner scanner = new Scanner(System.in);
		int entrada;
		String saida;

		System.out.println("Informe um n�mero de 1 a 7 para saber se � dia de semana ou n�o");
		entrada = scanner.nextInt();
		scanner.nextLine();

		switch (entrada) {
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			saida = "Dia de semana";
			break;

		case 1:
		case 7:
			saida = "Final de semana";
			break;
		default:
			saida = "N�o existe";
			break;
		}

		System.out.println(saida);

	}

}
