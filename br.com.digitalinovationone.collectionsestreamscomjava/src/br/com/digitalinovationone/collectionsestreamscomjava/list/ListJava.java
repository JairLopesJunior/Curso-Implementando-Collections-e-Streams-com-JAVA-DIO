package br.com.digitalinovationone.collectionsestreamscomjava.list;

import java.util.ArrayList;
import java.util.Collections;
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
	}
}
