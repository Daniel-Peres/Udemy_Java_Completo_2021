package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Informe os dados da conta");
			System.out.print("Numero: ");
			Integer number = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular: ");
			String holder = sc.nextLine();
			System.out.print("Saldo Inicial: ");
			Double balance = sc.nextDouble();
			System.out.print("Limite de saque: ");
			Double withdrawLimit = sc.nextDouble();

			Account conta = new Account(number, holder, balance, withdrawLimit);

			System.out.print("\nInforme valor do saque: ");
			double amount = sc.nextDouble();

			conta.withdraw(amount);
			System.out.println("Novo saldo: " + String.format("%.2f", conta.getBalance()));

			sc.close();

		} 
		catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido");
		} 
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}
}
