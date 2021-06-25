package trabalhandocomcollections.map;

import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos.");
        Map<String, Double> carros = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carros);
        System.out.println();

        System.out.println("Substitua  o consumo do Gol por 15.2 Km/l");
        carros.put("Gol", 15.2);
        System.out.println(carros);
        System.out.println();

        System.out.println("Confira se o modelo tucson está no dicionário: " + carros.containsKey("tucson"));
        System.out.println();

        System.out.println("Exiba o consumo do uno: " + carros.get("Uno"));
        System.out.println();

        //System.out.println("Exiba  o terceiro modelo  adicionado:");

        System.out.println("Exiba os modelos:");
        Set<String> modelos = carros.keySet();
        modelos.forEach(System.out::println);
        System.out.println();

        System.out.println("Exiba os consumos dos carros:");
        Collection<Double> consumos = carros.values();
        consumos.forEach(System.out::println);
        System.out.println();

        System.out.println("Exiba o modelo mais economico e seu consumo:");
        Double consumoMaisEficiente = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
        }

        System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
        System.out.println();

        System.out.println("Exiba o modelo menos economico  e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: carros.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }
        System.out.println();

        System.out.println("Exiba a soma dos consumos:");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma é: " + soma);
        System.out.println();

        System.out.println("Exiba a média dos consumos deste dicionario de carros: " + (soma/carros.size()));
        System.out.println();

        System.out.println("Remova os modelos com o  consumo igual a 15.6 Km/l: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        Double soma1 = 0d;
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6))
                iterator1.remove();
        }
        System.out.println(carros);
        System.out.println();

        System.out.println("Exiba todos os carros na ordem em que foram informados:");
        Map<String, Double> carrosNaOrdemDeInsercao = new LinkedHashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosNaOrdemDeInsercao);
        System.out.println();

        System.out.println("Exiba o dicionario ordenado pelo modelo:");
        Map<String, Double> carrosModelosOrdenados = new TreeMap<>(carrosNaOrdemDeInsercao);
        System.out.println(carrosModelosOrdenados);
        System.out.println();

        System.out.println("Apague o dicionario de carros:");
        carros.clear();
        System.out.println();

        System.out.println("Confira se o dicionario esta vazio: " + carros.isEmpty());
    }
}
