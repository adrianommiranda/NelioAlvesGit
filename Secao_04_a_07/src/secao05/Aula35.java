package secao05;

public class Aula35 {

	public static void main(String[] args) {
		// Estrutura condicional if-else

		int x = 28;

		if (x >= 5 && x <= 12) {
			System.out.println("bom dia");
		} else if (x > 12 && x <= 18) {
			System.out.println("Boa tarde");
		} else if (x > 18 && x < 24) {
			System.out.println("boa noite");
		} else if (x >= 0 && x < 5) {
			System.out.println("Boa madrugada");
		} else {
			System.out.println("não existe");
		}

	}

}
