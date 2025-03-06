package secao05;

public class Aula40 {

	public static void main(String[] args) {
		//Expressão condicional ternária

		int idade = 18;
		String saida;
		double mesada;
		
		
		saida = (idade >= 18) ? "maior de idade" : "Menor de idade";
		mesada = (idade >= 18)? idade*10 : idade*20;
		
		System.out.println(saida);
		System.out.println(mesada);
	}

}
