package streams;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TreinandoStreams {

	public static void main(String[] args) {
		
		Set<String> nomes = new  HashSet<>();
		
		nomes.add("Jair");
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Isabelly");
		
		// Exibindo a Fila
		System.out.println("Fila: " + nomes);
		
		// Retornar a conta do numero de nomes da Fila
		System.out.println("Numero de nomes: " + nomes.stream().count());
		
		// Retornar 3 primeiros nomes da Fila
		System.out.println("3 primeiros nomes: " + nomes.stream().limit(3).collect(Collectors.toList())); // No caso da fila não vem os 3 primeiros por que ela não esta em Ordem

		// Retornar o nome com menor numero de caracteres
		System.out.println("Menor numero de letras: " + nomes.stream().min(Comparator.comparingInt(String::length)));
		
		// Retorna a Fila com numeros de caracter de cada nome
		System.out.println("Numero de caracter: " + nomes.stream().map(n -> 
			n.length()).collect(Collectors.toList()));
		
		// Retornar a Fila tudo em minusculo
		System.out.println("Fila Minuscula: " + nomes.stream().map(n -> 
			n.toLowerCase()).collect(Collectors.toList()));
		
		// Retornar a Fila tudo em Maiuscula
		System.out.println("Fila Maiuscula: " + nomes.stream().map(n -> 
			n.toUpperCase()).collect(Collectors.toList()));
		
		// Retornando Stream encadeado
		List<String> nomesConvertido = nomes
			.stream()
			.filter(n -> n.contains("a"))
			.sorted(Comparator.comparingInt(String::length))
			.limit(3)
			.collect(Collectors.toList());
		System.out.println(nomesConvertido);
	}

}
