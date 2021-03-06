package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

//		Exercicio 03 do video 70 do curso

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f\n", aluno.mediaFinal());

		if (aluno.mediaFinal() >= 60) {
			System.out.println("PASS");

		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", aluno.pontosFaltantes());
		}

		sc.close();
	}
}
