package secao05_estruturaCondicional_if_else;

import java.util.Scanner;

public class EstruturaCondicional_ex02 {

	public static void main(String[] args) {

//		Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
//		
//		Exemplos:
//		Entrada:  12  Sa�da: PAR
//		Entrada: -27  Sa�da: IMPAR
//		Entrada:   0  Sa�da: PAR

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
