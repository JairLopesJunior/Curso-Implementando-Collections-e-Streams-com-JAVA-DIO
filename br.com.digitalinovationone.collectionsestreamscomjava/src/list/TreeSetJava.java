package list;

import java.util.TreeSet;

public class TreeSetJava {

	public static void main(String[] args) {
		
		TreeSet<String> treeCapitais = new TreeSet<>();
		
		// Montando as arvores com as  capitais
		treeCapitais.add("Porto Alegre");
		treeCapitais.add("Florianopolis");
		treeCapitais.add("Curitiba");
		treeCapitais.add("São Paulo");
		treeCapitais.add("Rio de Janeiro");
		treeCapitais.add("Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da arvore
		System.out.println(treeCapitais.first());
		
		// Retorna a ultima capital no final da arvore
		System.out.println(treeCapitais.last());
		
		// Retorna a primeira capital abaixo na arvore da capital parametrizada
		System.out.println(treeCapitais.lower("Florianopolis"));
		
		// Retorna a primeira capital acima na arvore da capital parametrizada
		System.out.println(treeCapitais.higher("Frorianopolis"));
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da arvore, removendo do SET
		System.out.println(treeCapitais.pollFirst());
		
		// Retorna a primeira capital no  final da arvore, removendo do SET
		System.out.println(treeCapitais.pollLast());

		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
	}

}
