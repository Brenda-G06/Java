package aula8.exemploInterface;

public class Main {
        public static void main(String[] args) {
            Vetor v1 = new Vetor(10);

            
            v1.adiciona("A");
            v1.adiciona("B");
            v1.adiciona("C");
            v1.adiciona("D");
            System.out.println("Qual o tamanho de v1 "+ v1.getTamanho());
            System.out.println(v1);
            System.out.println("Apagando o elemento "+ v1.remove());
            System.out.println(v1);

            Lista l1 = new Vetor(5);

        }
}
