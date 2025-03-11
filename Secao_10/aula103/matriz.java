import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n =  scanner.nextInt();
		int cont = 0;
		int[][] matriz = new int[n][n];
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		//Diagonal proncipal
		for(int i=0; i < n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println("\n\n");
		
		//quantidade de colunas	  matriz[i].length
		//quantidade de linhas    matriz.length
		System.out.println("Contar números gativos");
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println("\n\nPossui números negativos = " + cont);
	}

}
