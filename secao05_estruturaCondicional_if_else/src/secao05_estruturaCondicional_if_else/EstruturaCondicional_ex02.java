package secao05_estruturaCondicional_if_else;

import java.util.Scanner;

public class EstruturaCondicional_ex02 {

	public static void main(String[] args) {

//		Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
//		
//		Exemplos:
//		Entrada:  12  Saída: PAR
//		Entrada: -27  Saída: IMPAR
//		Entrada:   0  Saída: PAR

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
