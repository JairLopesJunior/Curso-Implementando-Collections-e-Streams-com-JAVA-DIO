package trabalhandocomcollections.set;

import java.util.*;

public class ExercicioArcoIris {

    public static void main(String[] args) {

        System.out.println("Exiba todas as cores uma abaixo da outra:");
        Set<String> cores = new HashSet<>(){{
            add(new String("Amarelo"));
            add(new String("Azul"));
            add(new String("Vermelho"));
            add(new String("Verde"));

        }};
        cores.forEach(System.out::println);
        System.out.println();

        System.out.println("A quantidade de cores que o arco-iris tem:");
        System.out.println(cores.size());
        System.out.println();

        System.out.println("Exiba as cores em ordem alfabética:");
        Set<String> coresOrdemAlfabetica = new TreeSet<>(cores); //TreeSet deixa sempre ordenado
        System.out.println(coresOrdemAlfabetica);
        System.out.println();

        System.out.println("Exiba as cores na ordem inversa da que foi informada:");
        List<String> lista = new ArrayList<>(coresOrdemAlfabetica);
        Collections.sort(lista, Collections.reverseOrder());
        for(String l: lista){
            System.out.println(l);
        }
        System.out.println();

        System.out.println("Exiba todas as cores que começam com a letra V:");
        for(String c: cores){
            if(c.startsWith("V"))
                System.out.println(c);
        }
        System.out.println();

        System.out.println("Remova todas as cores que não começam com a letra V:");
        Iterator<String> iterator = cores.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(!next.startsWith("V")) iterator.remove();
        }
        cores.forEach(System.out::println);
        System.out.println();

        System.out.println("Limpe o conjunto:");
        cores.clear();
        System.out.println();

        System.out.println("Confira se o conjunto está vazio:");
        System.out.println(cores.isEmpty());
    }
}
