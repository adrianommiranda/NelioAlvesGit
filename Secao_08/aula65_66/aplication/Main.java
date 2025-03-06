package aplication;

import java.util.Scanner;

import entities.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// double a = 0, b = 0, c = 0;

		Triangulo t = new Triangulo();
		t.ladoA = scanner.nextDouble();
		t.ladoB = scanner.nextDouble();
		t.ladoC = scanner.nextDouble();

		// double p = (t.ladoA + t.ladoB + t.ladoC) / 2.0;
		double p = (t.areaTriangulo(t.ladoA, t.ladoB, t.ladoC));

		System.out.println(p);

		// double areat = Math.sqrt(p * (p - t.ladoA) * (p - t.ladoB) * (p - t.ladoC));
		// System.out.printf("triando área: %.4f%n", areat);
		
		t.perimetroTriangulo(t.ladoA, t.ladoB, t.ladoC, p);
	}

}
