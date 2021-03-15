package list;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
	
	// Crie uma fila e execute as seguintes operações:
	// Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.
	// Navegue na fila exibindo cada nome no console.
	// Retorne o primeiro item da fila, sem remove-lo.
	// Retorne o primeiro item da fila, removendo o mesmo.
	// Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
	// Retorne o tamanho da fila.
	// Verifique se a fila esta vazia.
	// Verifique se o nome Carlos esta na fila.

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Juliana");
		fila.add("Pedro");
		fila.add("Carlos");
		fila.add("Larissa");
		fila.add("João");
		
		System.out.println(fila); // Mostrando a fila
		
		fila.forEach(f -> {
			System.out.println(f);
		});
		
		String nomeRetornado = fila.peek(); // Retornando primeiro elemento sem remove-lo
		
		System.out.println(nomeRetornado + " " + fila);
		
		String elementoRemovido = fila.poll(); // Retornando elemento removido
		
		System.out.println(elementoRemovido);
		System.out.println(fila);
		
		fila.add("Daniel"); // Adicionando novo Elemento
		
		System.out.println(fila);
		
		int tamanho = fila.size(); // Retorna o tamanho da fila
		
		System.out.println(tamanho);
		
		boolean f = fila.isEmpty();
		
		System.out.println(f);
		
		boolean tem = fila.contains("Carlos");
		
		System.out.println(tem);
	}

}
