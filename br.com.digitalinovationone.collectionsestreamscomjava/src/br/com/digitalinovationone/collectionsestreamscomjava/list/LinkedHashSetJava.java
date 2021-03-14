package br.com.digitalinovationone.collectionsestreamscomjava.list;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetJava {

	public static void main(String[] args) {
		
		Set<Integer> sequenciaNumerica = new LinkedHashSet<>();
		
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(3);
		sequenciaNumerica.add(8);
		sequenciaNumerica.add(16);

		System.out.println(sequenciaNumerica);
		
		// Remove o numero do SET
		sequenciaNumerica.remove(4);
		
		System.out.println(sequenciaNumerica); // Perceba que as Ordens permanece a mesma da inserida
		
		// Retorna a quantidade de itens do SET
		System.out.println(sequenciaNumerica.size());
		
		
		// Navega em todos os itens do Iterator
		Iterator<Integer> iterator = sequenciaNumerica.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		sequenciaNumerica.forEach(s -> {
			System.out.println(s);
		});
		
		
	}

}
