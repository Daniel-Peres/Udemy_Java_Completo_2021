package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double initialDeposit = 0;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char c = sc.nextLine().charAt(0);

		if (c == 'y') {
			System.out.print("Enter initial deposit value: ");
			initialDeposit = sc.nextDouble();
		}

		Account conta = new Account(accountNumber, name, initialDeposit);

		System.out.println("\nAccount data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", conta.getAccoutNumber(), conta.getName(),
				conta.getBalance());

		System.out.print("\nEnter a deposit value: ");
		conta.deposito(sc.nextDouble());
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", conta.getAccoutNumber(), conta.getName(),
				conta.getBalance());

		System.out.println("\nEnter a withdraw value: ");
		conta.saque(sc.nextDouble());
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f\n", conta.getAccoutNumber(), conta.getName(),
				conta.getBalance());

		sc.close();

	}

}
