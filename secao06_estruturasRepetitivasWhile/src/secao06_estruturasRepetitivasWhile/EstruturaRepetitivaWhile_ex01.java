package secao06_estruturasRepetitivasWhile;

import java.util.Scanner;

public class EstruturaRepetitivaWhile_ex01 {

	public static void main(String[] args) {

//		Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
//		incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//		impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
//		
//		Exemplo:
//		Entrada: 2200		Sa�da: Senha Invalida
//		Entrada: 1020		Sa�da: Senha Invalida
//		Entrada: 2022		Sa�da: Senha Invalida
//		Entrada: 2002		Sa�da: Acesso Permitido

		Scanner sc = new Scanner(System.in);

		int senha = 0;

		while (senha != 2002) {
			senha = sc.nextInt();

			if (senha != 2002)
				System.out.println("Senha Inv�lida");
		}

		System.out.println("Acesso Permitido");

		sc.close();

	}

}
