package secao04_estruturaSequencial;


import java.util.Scanner;

public class EstruturaSequencial_ex1 {

	public static void main(String[] args) {
		//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
		//mensagem explicativa, conforme exemplos.

		//Entrada: 10 e 30   Sa�da: SOMA = 40
		
		int n1, n2;
		
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		System.out.println("SOMA = " + (n1 + n2));
		
		sc.close();

	}

}
