package br.com.digitalinovationone.collectionsestreamscomjava.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetJava {

	public static void main(String[] args) {
		
		Set<Double> notasAlunos = new HashSet<>();
		
		// Adicionando as notas no SET
		notasAlunos.add(5.8);
		notasAlunos.add(9.3);
		notasAlunos.add(6.5);
		notasAlunos.add(10.0);
		notasAlunos.add(5.4);
		notasAlunos.add(7.3);
		notasAlunos.add(3.8);
		notasAlunos.add(4.0);
		
		System.out.println(notasAlunos);

		// Removendo a Nota do SET
		notasAlunos.remove(3.8);
		
		System.out.println(notasAlunos);
		
		// Retornando a quantidade de itens do SET
		System.out.println(notasAlunos.size());
		
		// Navega em todos os itens do Iterator
		Iterator<Double> iterator = notasAlunos.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		notasAlunos.forEach(n -> {
			System.out.println(n);
		});
		
		notasAlunos.clear();
		
		System.out.println(notasAlunos.isEmpty()); // Retorna se o SET esta vazio ou não
	}

}
