package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //adicionando na posi��o 2 da lista

		System.out.println("Tamanho da lista = " + list.size());
		for (String x : list) {
			System.out.println(x);
		}		
					
//		list.remove(1); //removendo pela posi��o do elemento na lista
//		list.remove("Anna"); // removendo da lista pelo elemento
					
		System.out.println("------------------------------");
		System.out.println("--- Remover apenas nomes come�ados por M ---");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("--- Posi��o de Bob na lista ---");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("--- Apenas nomes come�ados com A ---");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		

	}

}
