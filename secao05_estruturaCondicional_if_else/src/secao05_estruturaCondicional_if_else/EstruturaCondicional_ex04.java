package secao05_estruturaCondicional_if_else;

import java.util.Scanner;

public class EstruturaCondicional_ex04 {

	public static void main(String[] args) {

//		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//		
//		Exemplos:
//		Entrada: 16   2		Saída: O JOGO DUROU 10 HORA(S)
//		Entrada:  0   0		Saída: O JOGO DUROU 24 HORA(S)
//		Entrada:  2  16		Saída: O JOGO DUROU 14 HORA(S)

		Scanner sc = new Scanner(System.in);

		int horaInicial, horaFinal, duracao;

		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		if (horaInicial == horaFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if (horaInicial < horaFinal) {
			duracao = horaInicial - horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)", Math.abs(duracao));
		} else {
			duracao = horaFinal - horaInicial + 24;
			System.out.printf("O JOGO DUROU %d HORA(S)", Math.abs(duracao));
		}
		sc.close();
	}

}
