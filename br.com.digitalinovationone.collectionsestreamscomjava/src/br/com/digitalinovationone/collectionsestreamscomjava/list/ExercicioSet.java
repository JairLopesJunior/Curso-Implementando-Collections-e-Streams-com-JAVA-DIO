package br.com.digitalinovationone.collectionsestreamscomjava.list;

import java.util.TreeSet;

public class ExercicioSet {
	
	// Exercicio Final
	// Crie um SET e execute as seguintes operaçoes:
	// Adicione 5 numeros inteiros: 3, 88, 20, 44, 3.
	// Navegue no SET exibindo cada numero no console.
	// Remova o primeiro item do SET.
	// Adicione um novo numero no  SET: 23.
	// Verifique o tamanho do SET.
	// Verifique se o SET está vazio

	public static void main(String[] args) {
		
		TreeSet<Integer> numeros = new TreeSet<>();
		
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		
		System.out.println(numeros); // Exibindo a fila
		
		numeros.forEach(i -> {
			System.out.println(i);
		});
		
		numeros.pollFirst(); // Removendo o primeiro item da Fila
		
		System.out.println(numeros);
		
		numeros.add(23); // Adicionando novo numero
		
		System.out.println(numeros);
		
		System.out.println(numeros.size()); // Verificando o tamanho da Fila

		System.out.println(numeros.isEmpty()); // Verificando se o SET esta vazio
	}

}
