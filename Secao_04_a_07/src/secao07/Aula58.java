package secao07;

import java.util.Scanner;

public class Aula58 {

	public static void main(String[] args) {
		// Operadores bitwise

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		
		System.out.println("\n\n--------------------------------------------\n\n");
		
		//Verificando se o sexto bit � igual
		 Scanner sc = new Scanner(System.in);
		 int mask = 0b100000;
		 int n = sc.nextInt();
		 if ((n & mask) != 0) {
		 System.out.println("6th bit is true!");
		 }
		 else {
		 System.out.println("6th bit is false");
		 }
		 sc.close();
	}

}
