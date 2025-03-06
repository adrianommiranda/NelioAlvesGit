package entities;

public class Triangulo {
	public double ladoA;
	public double ladoB;
	public double ladoC;
	
	public double areaTriangulo( double a, double b, double c) {
		double area = (a + b + c) / 2.0;
		return area;
	}
	
	public void perimetroTriangulo(double a, double b, double c, double p) {
		double perimetro = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
		System.out.printf("Área do triangulo : %.4f%n", perimetro);
	}
}