package trabalhandocomcollections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

//        List lista = new ArrayList(); // Antes do Java 8
//        List<Double> lista2 = new ArrayList<>();
//        List<Double> lista3 = new ArrayList<>(Arrays.asList(7d, 8.4, 9.2, 6d));

        List<Double> notas = new ArrayList<>();

        System.out.println("Crie uma lista e adicione 7 notas");

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(7.0);
        notas.add(3.6);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5");
        System.out.println(notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0  pela nota  7.0");
        notas.set(0, 5.0);
        System.out.println(notas);

        System.out.println("Verifique se a nota 5.0 esta na lista");
        System.out.println(notas.contains(5d));

        System.out.println("Exiba a terceira nota adicionada");
        System.out.println(notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double  next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
    }
}
