package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {

	public static void main(String[] args) {
		
		HashMap<String, Integer> campeoesMundialFifa = new HashMap<>();

		// Adicionando os campeos mundiais fifa no mundo
		campeoesMundialFifa.put("Brasil", 5);
		campeoesMundialFifa.put("Alemanha", 4);
		campeoesMundialFifa.put("Italia", 4);
		campeoesMundialFifa.put("Uruguai", 2);
		campeoesMundialFifa.put("Argentina", 2);
		campeoesMundialFifa.put("França", 2);
		campeoesMundialFifa.put("Inglaterra", 1);
		campeoesMundialFifa.put("Espanha", 1);
		
		System.out.println(campeoesMundialFifa);
		
		// Atualiza o valor para a chave Brasil
		campeoesMundialFifa.put("Brasil", 6);
		
		System.out.println(campeoesMundialFifa);
		
		// Retorna  numero do elemento buscado, no caso a Argentina
		System.out.println(campeoesMundialFifa.get("Argentina"));
		
		// Retorna se existe ou não um campeão França
		System.out.println(campeoesMundialFifa.containsKey("França"));
		
		// Retorna se existe ou não alguma seleção hexa campeão
		System.out.println(campeoesMundialFifa.containsValue(6));
		
		// Retorna o tamanho da MAP
		System.out.println(campeoesMundialFifa.size());
		
		for(Map.Entry<String, Integer> c : campeoesMundialFifa.entrySet()) {
			System.out.println(c.getKey() + "--" + c.getValue());
		}
		
		for(String key : campeoesMundialFifa.keySet()) {
			System.out.println(key + "--" + campeoesMundialFifa.get(key));
		}
		
		// Verifica se o mapa contem a chave Estados Unidos
		System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));
		
		// Verifica se o mapa contem o valor 5
		System.out.println(campeoesMundialFifa.containsValue(5));
		
		// Verifica o tamanho antes e depois de limpar o mapa
		System.out.println(campeoesMundialFifa.size());
		
		campeoesMundialFifa.clear(); // Limpa o MAP
		
		// Verifica o tamanho antes e depois de limpar o mapa
		System.out.println(campeoesMundialFifa.size());
	}

}
