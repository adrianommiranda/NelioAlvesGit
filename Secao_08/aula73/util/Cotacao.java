package util;

public class Cotacao {
	public static final double IOF = 0.06;
	
	public static double converterDollarParaReal(double cotacaoDollar, double dollar) {
		double convert = (dollar * cotacaoDollar) * (1 + IOF);
		return convert;
	}
}
