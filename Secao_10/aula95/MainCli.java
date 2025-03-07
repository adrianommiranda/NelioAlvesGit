import java.util.Locale;
import java.util.Scanner;

public class MainCli {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		//Vetor do tipo Cliente de 10 posições
		Cliente[] vetor = new Cliente[10];

		//Vai informar o tamanho do vetor, quantos quartos vão ser alugados
		System.out.println("Informe quantos quartos vão ser alugados?");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Aluguel " + i + ":");
			System.out.println("Nome: ");
			scanner.nextLine();
			String nome = scanner.nextLine();

			
			System.out.println("Informe o número do quarto");
			int nQuarto = scanner.nextInt();

			/*
			 * Cliente cliente = new Cliente(nome); vetor[nQuarto] = cliente;
			 */

			// forma resumida - vou informar o index do cliente, que vai ser o quarto
			vetor[nQuarto] = new Cliente(nome);
		}

		// Mostrando todos os quartos
		System.out.println("\n\nTodos os quartosn\n");
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("\n\nQuartos oculpados\n\n");
		
		//mostrando apenas quartos oculpados
		for (int i = 0; i < 10; i++) {
			if(vetor[i] !=null) {
				System.out.println(i + " - cliente " + vetor[i].getNome() );	
			}
			
		}
		
	}

}
