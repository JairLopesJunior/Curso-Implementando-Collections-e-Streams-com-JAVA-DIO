package map;

import java.util.TreeMap;

public class TreeMapJava {

	public static void main(String[] args) {
		
		TreeMap<String, String> treeCapitais = new TreeMap<>();

		treeCapitais.put("RS", "Porto Alegre");
		treeCapitais.put("SC", "Florianopolis");
		treeCapitais.put("PR", "Curitiba");
		treeCapitais.put("SP", "São Paulo");
		treeCapitais.put("RJ", "Rio de Janeiro");
		treeCapitais.put("BH", "Belo Horizonte");
		
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da arvore
		System.out.println(treeCapitais.firstKey());
		
		// Retorna a ultima capital no final da arvore
		System.out.println(treeCapitais.lastKey());
		
		// Retorna a primeira capital abaixo da arvore da capital parametrizada
		System.out.println(treeCapitais.lowerKey("SC"));
		
		// Retorna a primeira capital acima da arvore da capital parametrizada
		System.out.println(treeCapitais.higherKey("SC"));
		
		// Exibe todas as capitais no console
		System.out.println(treeCapitais);
		
		// Retorna a primeira capital no topo da arvore
		System.out.println(treeCapitais.firstEntry().getKey() + "--" + treeCapitais.firstEntry().getKey());
		
		// Retorna a ultima capital no final da arvore
		System.out.println(treeCapitais.lastEntry().getKey() + "--" + treeCapitais.lastEntry().getKey());
		
	}

}
