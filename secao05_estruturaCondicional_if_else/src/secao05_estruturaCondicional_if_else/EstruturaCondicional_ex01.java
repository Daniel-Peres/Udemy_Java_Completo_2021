package secao05_estruturaCondicional_if_else;

import java.util.Scanner;

public class EstruturaCondicional_ex01 {

	public static void main(String[] args) {

//		Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
//		Exemplos:
//			
//		Entrada: -10  Sa�da: NEGATIVO
//		Entrada:   8  Sa�da: NAO NEGATIVO
//		Entrada:   0  Sa�da: NAO NEGATIVO

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();

	}

}
