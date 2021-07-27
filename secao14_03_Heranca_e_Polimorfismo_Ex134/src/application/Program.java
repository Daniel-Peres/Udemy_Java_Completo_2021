package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();

		List<Pessoa> contribuintes = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte #" + i + ":");
			System.out.print("Fisica ou Jurídica (f/j): ");
			char ch = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'f') {
				System.out.print("Despesas com saúde: ");
				double gastosSaude = sc.nextDouble();
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}

		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (Pessoa contribuinte : contribuintes) {
			System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", contribuinte.calculoImposto()));
		}
		sc.close();
	}

}
