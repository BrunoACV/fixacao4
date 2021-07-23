package Util;

public class Converter {

	public static double currencyConverter(double dollar, double dollarsBought) {
		double resultado = dollar * dollarsBought;
		resultado += resultado * 6 / 100;
		return resultado;

	}

}
