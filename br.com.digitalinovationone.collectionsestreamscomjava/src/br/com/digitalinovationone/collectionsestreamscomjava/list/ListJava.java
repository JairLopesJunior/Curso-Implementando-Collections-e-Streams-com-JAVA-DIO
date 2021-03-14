package br.com.digitalinovationone.collectionsestreamscomjava.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListJava {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("jair");
		nomes.add("carlos");
		nomes.add("pedro");
		nomes.add("anderson");
		nomes.add("joao");
		nomes.add("maria");
		
		System.out.println(nomes);
				
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		nomes.set(2, "pessoa");
		
		System.out.println(nomes);
		
		nomes.remove(4);
		
		System.out.println(nomes); // Remove o indice 4
		
		nomes.remove("joao");
				
		System.out.println(nomes); // Remove pelo nome
		
		String nome = nomes.get(1); // Buscar pelo Indice e retornar para String
		
		System.out.println(nome);
		
		int tamanho = nomes.size(); // Retorna quantos elementos tem  no Array
		
		System.out.println(tamanho);
		
		boolean tem = nomes.contains("jair"); // Retorna um boolean se tem ou não o nome passado
		
		System.out.println(tem);
		
		boolean listaNaoVazia = nomes.isEmpty(); //  Retorna boolean se a lista esta vazia ou não
		
		System.out.println(listaNaoVazia);
		
		nomes.clear(); // Limpa a lista
		
		boolean listaVazia = nomes.isEmpty(); //  Retorna boolean se a lista esta vazia ou não
		
		System.out.println(listaVazia);
		
		nomes.add("joao");
		nomes.add("jair");
		
		System.out.println(nomes);
		
		int posicao = nomes.indexOf("jair"); // Retorna o indice da String encontrada, se caso não ter retorna -1
		
		System.out.println(posicao);
		
		for(String n : nomes){
			System.out.println(n);
		}
		
		Iterator<String> iterator = nomes.iterator();
		
		while(iterator.hasNext()) { // Retorna true enquanto ter elementos na Lista
			System.out.println(iterator.next()); // Retorna o Objeto que esta iterando no momento
		}

	}
}
