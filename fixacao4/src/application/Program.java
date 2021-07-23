package application;

import java.util.Locale;
import java.util.Scanner;

import Util.Converter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price?");
		double dollar = sc.nextDouble();
		System.out.print("How may dollars will be bought?");
		double dollarsBought = sc.nextDouble();

		double res = Converter.currencyConverter(dollar, dollarsBought);
		System.out.printf("Amount to be paid in reais = %.2f%n", res);
		sc.close();
	}

}
