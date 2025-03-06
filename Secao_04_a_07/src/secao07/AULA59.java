package secao07;

public class AULA59 {

	public static void main(String[] args) {

		/*
		 * Funções interessantes para String
		 * 
		 * trim - remove espaços
		 * 
		 * • Formatar: toLowerCase(), toUpperCase(), trim() • Recortar:
		 * substring(inicio), substring(inicio, fim) • Substituir: Replace(char, char),
		 * Replace(string, string) • Buscar: IndexOf, LastIndexOf • str.Split(" "
		 */

		String original = "abcde FGHIJ ABC abc DEFG   ";

		// Convertendo para letras minusculas
		String s01 = original.toLowerCase();

		// Convertendo para letras maiusculas
		String s02 = original.toUpperCase();

		// Mantém a mesma strin original, mas exluir os espaço do lado direito
		String s03 = original.trim();

		// Vou passar como argumento número 2, eu quero pegar somente os caracter da
		// posição 2 em diante, e montar uma nova string com esses caracter
		String s04 = original.substring(2);

		// Vou passar dois argumento, apartir do caracter 9, começo a copiar até abaixo
		// do caracter 9
		String s05 = original.substring(2, 9);

		// Sempre que achar o caracter a troca pelo x
		String s06 = original.replace('a', 'x');

		// Sempre que achar uma String "abc" troca pela "xy"
		String s07 = original.replace("abc", "xy");

		// qual é a primeira ocorrência do substrig "bc" - na posição 1. Começa a contar
		// apatir do 0
		int i = original.indexOf("bc");

		// qual é a última ocorrência do substrig "bc" - na posição 17
		int j = original.lastIndexOf("bc");

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);

		System.out.println("\n\n-------------------------------------\n\n");
		
		System.out.println("Operação split");
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(word3);

	}

}
