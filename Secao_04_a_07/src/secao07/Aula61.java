package secao07;

import java.util.Scanner;

public class Aula61 {

	public static void main(String[] args) {
		// Funções

		 Scanner sc = new Scanner(System.in);
		 int a, b, c;
		 System.out.println("Digite os três números:");
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 
		 maior(a,b,c);
		 
		System.out.println( "Segunda resposta " + rMaior(a, b, c));
		 
		 
	}
	
	public static void maior(int a, int b, int c) {
		 if(a>b && a>c) {
			 System.out.println("A é o maior " + a);
		 }else if(b>c){
			 System.out.println("B é o maior " + b);
		 }else{
			 System.out.println("C é o maior " + c);
		 }
	}
	
	
	public static int rMaior(int a, int b, int c) {
		if(a>b && a>c) {
			 return a;
		 }else if(b>c){
			 return b;
		 }else{
			 return c;
		 }
	}
	
	
	
	
}


