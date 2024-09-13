package aula9;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        lista.add("C");
        lista.add(1, "B");

            System.out.println("O tamanho da lista é "+ lista.size());
            System.out.println("A posição de 'C' na lista é "+ lista.indexOf("C"));
            System.out.println("A posição de 'C' na lista é "+ lista.lastIndexOf("C"));
            System.out.println("O elemento da posição 4 é "+ lista.get(4));
            lista.clear();
            System.out.println(" A lista está vazia: "+ lista.isEmpty());
            System.out.println(lista);

    }
}
