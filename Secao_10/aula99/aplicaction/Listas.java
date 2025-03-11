package aplicaction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	
	/*
		1 - adicionando valores na listas

		2 - Escrevendo a lista

		3 - inserindo novo elemento na posição 1 - depois de Marley

		4 - saber o tamanho da lista

		5 - Remover elemento de uma lista pelo index. Retirar o box

		6 - Remover elemento de uma lista pelo String. Retirar o bob

		7 - Remover da lista, todos que atende a um predicado - remover todos que comecem com a letra L

		8 - Encontrar a posição de um elemento - caso não encontrar retorna -1

		9 - Filtando na lista, apenas que começam com  letra M e coloque em outra lista 

		10 - Encontrar primeiro elemento que começa com a letra P, se não existir retorna nulo
	*/
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		//adicionando valores na listas
		lista.add("Marley");
		lista.add("Bob");
		lista.add("Luck");
		lista.add("Brutus");
		
		//Escrevendo a lista
		System.out.println(lista);

		System.out.println("\n");
		
		//Percorrer a lista
		for (String animal : lista) {
			System.out.println(animal);			
		}
		
		System.out.println("\n");
		
		//inserindo novo elemento na posição 1 - depois de Marley
		lista.add(1,"Box");
		
		for (String animal : lista) {
			System.out.println(animal);			
		}
		
		System.out.println("\n");
		
		//saber o tamanho da lista
		System.out.println("Tamanho da lista = " + lista.size());
		
		System.out.println("\n");
		
		//Remover elemento de uma lista pelo index. Retirar o box
		lista.remove(1);
		
		for (String animal : lista) {
			System.out.println(animal);			
		}
		
		System.out.println("\n");
		
		//Remover elemento de uma lista pelo String. Retirar o bob
		lista.remove("Bob");
				
		for (String animal : lista) {
			System.out.println(animal);			
		}
		
		System.out.println("\n");
		lista.add("Luiz");
		lista.add(2, "lucas");
		
		//Remover da lista, todos que atende a um predicado - remover todos que comecem com a letra L
		lista.removeIf(x -> x.charAt(0) == 'L');
				
		System.out.println("\n");
		
		for (String animal : lista) {
			System.out.println(animal);			
		}
		
		System.out.println("\n");
		
		//Encontrar a posição de um elemento - caso não encontrar retorna -1
		System.out.println(lista.indexOf("lucas"));
		System.out.println(lista.indexOf("Carro"));
		
		System.out.println("\n");
		
		//Filtando na lista, apenas que começam com  letra M e coloque em outra lista --------------------------------------------
		lista.add("Marcos");
		lista.add("Monolítico");
		
		//Vou ter que criar uma nova lista do tipo String, declarar um comando pera pegar a minha lista, 
		//filtrar neste elemento os nomes que começam com M e devolver para mim uma nova lista,
		//com os elementos que começam com a letra M
		List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
			
		for (String r : resultado) {
			System.out.println(r);
		}
		
		//--------------------------------------------------------------------------------------------------------------------------
		
		System.err.println("\n\n");
		
		//Encontrar primeiro elemento que começa com a letra P, se não existir retorna nulo
		lista.add(2,"Palmeiras");
		lista.add("Primo");
		
		String nome = lista.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(nome);
	}

}
