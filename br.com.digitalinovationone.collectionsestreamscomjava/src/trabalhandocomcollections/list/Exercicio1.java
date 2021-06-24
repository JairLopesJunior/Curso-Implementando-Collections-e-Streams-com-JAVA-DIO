package trabalhandocomcollections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> lista = new ArrayList<>();
        double mediaTrimestral = 0.0;

        for(int i = 0; i < 6; i++){
            System.out.println("Informe a média da temperatura do " + (i+1) + "º mês do ano: ");
            double media = scan.nextDouble();
            mediaTrimestral += media;
            lista.add(media);
        }

        mediaTrimestral = (mediaTrimestral/lista.size());

        for(Double l: lista){
            if(l > mediaTrimestral)
                System.out.println(l);
        }

    }
}
