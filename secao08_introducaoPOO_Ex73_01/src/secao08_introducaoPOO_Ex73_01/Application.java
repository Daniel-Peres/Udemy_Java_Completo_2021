package secao08_introducaoPOO_Ex73_01;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

//		Exercicio do video 73 do curso

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		CurrencyConverter money = new CurrencyConverter();

		System.out.print("Qual o pre�o do d�lar? ");
		money.dollarPrice = sc.nextDouble();
		System.out.print("Quantos d�lares voc� quer comprar? ");
		money.dollarQuantity = sc.nextDouble();
		System.out.printf("Total a pagar em reais (+imposto 6 porc. ) = %.2f", money.dollarToReal());

		sc.close();

	}

}
