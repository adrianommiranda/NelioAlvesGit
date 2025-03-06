package secao06;

public class Aula50 {

	public static void main(String[] args) {
		//Estrutura repetitiva para (for)
		
		//Faça um programa que leia de 1 a 5 e informe o somatório deles
		int soma = 0;
		
		for (int i = 1; i <= 5; i++) {
			soma = soma + i;
			System.out.println(i);
		}
		
		System.out.println("soma dos valores " + soma);
		
	}

}
