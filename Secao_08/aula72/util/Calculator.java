package util;

public class Calculator {
	
	//variável static
	public static final double PI = 3.14159;

	//métodos static
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	//métodos static
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
