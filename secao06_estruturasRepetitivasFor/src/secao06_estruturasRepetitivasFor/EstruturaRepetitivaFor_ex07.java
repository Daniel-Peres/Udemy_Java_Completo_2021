package secao06_estruturasRepetitivasFor;

import java.util.Scanner;

public class EstruturaRepetitivaFor_ex07 {

	public static void main(String[] args) {

//		Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
//		come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
//		exemplo.
//		
//		Exemplo:
//		Entrada:	5 	Sa�da:	1 1 1
//								2 4 8
//								3 9 27
//								4 16 64
//								5 25 125

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.printf("%d %d %d\n", i, i * i, i * i * i);
		}

		sc.close();

	}

}
