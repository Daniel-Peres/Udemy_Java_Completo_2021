package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getPath: " + path.getPath()); // caminho completo
		System.out.println("getName: " + path.getName()); // só no me do arquivo
		System.out.println("getParent: " + path.getParent()); // só caminho sem nome do arquivo

		sc.close();

	}

}
