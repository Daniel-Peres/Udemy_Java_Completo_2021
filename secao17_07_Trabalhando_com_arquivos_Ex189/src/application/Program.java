package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	/*
	 * Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de
	 * itens vendidos. Cada item possui um nome, preço unitário e quantidade,
	 * separados por vírgula. Você deve gerar um novo arquivo chamado "summary.csv",
	 * localizado em uma subpasta chamada "out" a partir da pasta original do
	 * arquivo de origem, contendo apenas o nome e o valor total para aquele item
	 * (preço unitário multiplicado pela quantidade), conforme exemplo.
	 * 
	 * Source file: Output file( out\summary.csv):
	 * 
	 * TV LED,1290.99,1 TV LED,1290.99 Video Game Chair,350.50,3 Video Game
	 * Chair,1051.50 Iphone X,900.00,2 Iphone X,1800.00 Samsung Galaxy 9,850.00,2
	 * Samsung Galaxy 9,1700.00
	 * 
	 */

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>(); //lista de produtos

		System.out.println("Enter file path: "); 
		String sourceFileStr = sc.nextLine(); // armazenar caminho do arquivo que foi digitado

		File sourceFile = new File(sourceFileStr); // pegando arquivo de origem
		String sourceFolderStr = sourceFile.getParent(); // armazenando o caminho da pasta do arquivo

		boolean success = new File(sourceFolderStr + "\\out").mkdir(); // criando diretorio out na pasta original do arquivo

		String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; // armazenando o caminho do arquivo de destino

		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) { // lendo o arquivo de origem

			String itemCsv = br.readLine(); // pegando a primeira linha do arquivo de origem
			while (itemCsv != null) { // enquando nao enquantrar linha vazia continua lendo a proxima linha

				String[] fields = itemCsv.split(",");// cria vetor com os campos da linha, separando pela virgula
				String name = fields[0]; // pega o primeiro campo e armazena em nome
				double price = Double.parseDouble(fields[1]); // pega o segundo campo e armazena em preco
				int quantity = Integer.parseInt(fields[2]); // pega o terceiro campo e armazena em quantidade

				list.add(new Product(name, price, quantity)); // adiciona novo produto na lista de produtos

				itemCsv = br.readLine(); // le a proxima linha
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) { // escrevendo o arquivo de destino

				for (Product item : list) { // passa por toda a lista de produtos
					bw.write(item.getName() + "," + String.format("%.2f", item.total())); // escreve s linhs com o produto da lista
					bw.newLine(); // pula para a proxima linha
				}

				System.out.println(targetFileStr + " CREATED!"); // mensagem de arquivo criado

			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage()); // erro na escrita do arquivo
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage()); // erro na leitura do arquivo
		}

		sc.close(); // fechar Scanner
	}
}