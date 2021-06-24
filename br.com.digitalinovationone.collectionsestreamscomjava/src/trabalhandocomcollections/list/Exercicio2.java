package trabalhandocomcollections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Boolean> lista = new ArrayList<>();
        int i = 0;

        System.out.println("=============================================");
        System.out.println("Informe CINCO perguntas para um crime:");
        System.out.println("=============================================");

        System.out.println("Telefonou para a vitima? (true/false)");
        boolean r1 = scan.nextBoolean();
        lista.add(r1);

        System.out.println("Esteve no local do crime? (true/false)");
        boolean r2 = scan.nextBoolean();
        lista.add(r2);

        System.out.println("Mora perto da vitima? (true/false)");
        boolean r3 = scan.nextBoolean();
        lista.add(r3);

        System.out.println("Devia para a vitima? (true/false)");
        boolean r4 = scan.nextBoolean();
        lista.add(r4);

        System.out.println("Já trabalhou com a vitima? (true/false)");
        boolean r5 = scan.nextBoolean();
        lista.add(r5);

        for(Boolean b: lista){
            if(b == true)
                i++;
        }

        if(i > 0 && i < 3)
            mostreResposta("Suspeita");

        if(i > 2 && i < 5)
            mostreResposta("Cúmplice");

        if(i == 5)
            mostreResposta("Assassina");

        mostreResposta("Inocente");
    }

    private static void mostreResposta(String resposta){
        System.out.println("Voce está classificada como: " + resposta);
        System.exit(0);
    }
}

