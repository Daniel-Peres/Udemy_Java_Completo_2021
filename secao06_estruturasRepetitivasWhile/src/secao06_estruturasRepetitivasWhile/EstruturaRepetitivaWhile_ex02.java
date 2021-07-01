package secao06_estruturasRepetitivasWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhile_ex02 {

	public static void main(String[] args) {

//		Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//		cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//		menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
//		
//		Exemplo:
//		Entrada:   2   2		Saída:	primeiro
//				   3  -2				quarto
//				  -8  -1				terceiro
//				  -7   1				segundo
//				   0   2

		Scanner sc = new Scanner(System.in);

		double x = -1;
		double y = -1;

		while (y != 0 && x != 0) {

			x = sc.nextDouble();
			y = sc.nextDouble();

			if (x != 0 && y != 0) {

				if (x > 0 && y > 0) {
					System.out.println("primeiro");
				} else if (x < 0 && y > 0) {
					System.out.println("segundo");
				} else if (x < 0 && y < 0) {
					System.out.println("terceiro");
				} else {
					System.out.println("quarto");
				}
			}

		}

		sc.close();

	}

}
