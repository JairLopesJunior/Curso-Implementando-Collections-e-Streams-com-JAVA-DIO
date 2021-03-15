package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListJava {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Patricia");
		fila.add("Roberto");
		fila.add("Flavio");
		fila.add("Pamela");
		fila.add("Anderson");
		
		System.out.println(fila);
		String clienteASerAtendido = fila.poll(); // Ele remove o primeiro elemento e retorna o elemento removido
		
		System.out.println(clienteASerAtendido);
		System.out.println(fila);
		
		String primeiroCliente = fila.peek(); // Ele retorna o primeiro elemento da fila, mas não remove, caso a fila esteja vazia retorna null
		
		System.out.println(primeiroCliente);
		System.out.println(fila);
		
		//fila.clear();
		
		String primeiroElementoOuErro = fila.element(); // Ele retorna o primeiro elemento da fila, caso esteja vazia ele da uma exception
		
		System.out.println(primeiroElementoOuErro);
		System.out.println(fila);

		for(String f : fila) {
			System.out.println(f);
		}
		
		Iterator<String> iteratorFila = fila.iterator();
		
		while(iteratorFila.hasNext()) {
			System.out.println("-" + iteratorFila.next());
		}
		
		System.out.println(fila.size()); // Retorna o tamanho da Lista, contando os elementos
		//fila.clear();
		System.out.println(fila.isEmpty()); // Retorna true se a lista ter vazia ou false caso contrario
	}
	
}
