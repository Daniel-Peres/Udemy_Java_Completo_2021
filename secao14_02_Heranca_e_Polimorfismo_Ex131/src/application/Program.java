package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		List<Product> produtos = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			switch (ch) {
			case 'c':
				Product pc = new Product(name, price);
				produtos.add(pc);
				break;
			case 'u':
				System.out.print("Maufacture date (DD/MM/YYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product pu = new UsedProduct(name, price, manufactureDate);
				produtos.add(pu);				
				break;
			case 'i':
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product pi = new ImportedProduct(name, price, customsFee);
				produtos.add(pi);
				break;
			default:
				System.out.println("Digite uma opção válida");
			}

		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product produto : produtos) {
			System.out.println(produto.priceTag());
		}

		sc.close();

	}

}
