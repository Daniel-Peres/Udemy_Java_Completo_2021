package secao04_estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial_ex5 {

	public static void main(String[] args) {
		
//		Fazer um programa para ler o c?digo de uma pe?a 1, o n?mero de pe?as 1, o valor unit?rio de cada pe?a 1, o
//		c?digo de uma pe?a 2, o n?mero de pe?as 2 e o valor unit?rio de cada pe?a 2. Calcule e mostre o valor a ser pago.
//		
//		Exemplos:
//		Entrada: 12, 1,  5.30	 16, 2,  5.10      Sa?da: VALOR A PAGAR: R$ 15.50
//		Entrada: 13, 2, 15.30	161, 4,  5.20      Sa?da: VALOR A PAGAR: R$ 51.40
//		Entrada:  1, 1, 15.10	  2, 1, 15.10      Sa?da: VALOR A PAGAR: R$ 30.20

		Locale.setDefault(Locale.US);
		int cod1, cod2, numPecas1, numPecas2;
		double valorUnitario1, valorUnitario2, valorTotal;
		
		Scanner sc = new Scanner(System.in);
		cod1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		cod2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		sc.close();
		
		valorTotal = numPecas1 * valorUnitario1 + numPecas2 * valorUnitario2;
		

		System.out.printf("Codigo pe?a 1: %d , quantidade: %d , Subtotal: %.2f\n", cod1, numPecas1, numPecas1 * valorUnitario1);
		System.out.printf("Codigo pe?a 2: %d , quantidade: %d , Subtotal: %.2f\n", cod2, numPecas2, numPecas2 * valorUnitario2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
	}

}
