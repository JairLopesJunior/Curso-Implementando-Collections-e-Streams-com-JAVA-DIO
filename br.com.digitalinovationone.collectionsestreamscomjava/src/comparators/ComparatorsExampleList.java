package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {

	public static void main(String[] args) {
		
		List<Estudante> estudantes = new ArrayList<>();
			
		estudantes.add(new Estudante("Pedro", 19));
		estudantes.add(new Estudante("Carlos", 23));
		estudantes.add(new Estudante("Mariana", 21));
		estudantes.add(new Estudante("João", 18));
		estudantes.add(new Estudante("Thiago", 20));
		estudantes.add(new Estudante("George", 22));
		estudantes.add(new Estudante("Larissa", 21));
		
		System.out.println("---- Ordem de inserção ----");
		System.out.println(estudantes);

		estudantes.sort((f, s) -> f.getIdade() - s.getIdade()); // LAMBDA - Ordenando por Idade
		
		System.out.println("---- Ordem natural dos numeros - idade ----");
		System.out.println(estudantes);
		
		estudantes.sort((f, s) -> s.getIdade() - f.getIdade());
		
		System.out.println("---- Ordem reversa dos numeros - Idade ----");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
		
		System.out.println("---- Ordem natural dos numeros - idade (Metodo de Referencia) ----");
		System.out.println(estudantes);
		
		Collections.sort(estudantes);
		
		System.out.println("---- Ordem natural dos numeros - idade (Interface Comparable) ----");
		System.out.println(estudantes);
		
	}

}
