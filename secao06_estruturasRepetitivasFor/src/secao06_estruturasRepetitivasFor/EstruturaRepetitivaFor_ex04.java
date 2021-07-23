package secao06_estruturasRepetitivasFor;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaFor_ex04 {

	public static void main(String[] args) {

//		Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
//		
//		Exemplo:
//		Entrada:	3
//					3 -2	Saída:-1.5
//				   -8 0		divisao impossivel
//					0 8		0.0
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double n1, n2;

		for (int i = 0; i < N; i++) {

			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			double resultado = n1 / n2;

			if (n2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f%n", resultado);
			}

		}

		sc.close();

	}

}
