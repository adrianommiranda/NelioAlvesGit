package aplication;

import java.util.Scanner;

import util.Calculator;

public class mainClac {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = scanner.nextDouble();
		
		//Como o método é static, chamo ele direto
		double c = Calculator.circumference(radius);
		
		//Como o método é static, chamo ele direto
		double v = Calculator.volume(radius);
		
		 System.out.printf("Circumference: %.2f%n", c);
		 System.out.printf("Volume: %.2f%n", v);
		 
		//Como o método é static, chamo ele direto
		 System.out.printf("PI value: %.2f%n", Calculator.PI);
	}

}
