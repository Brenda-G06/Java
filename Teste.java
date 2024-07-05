package aula5.polimorfismo;

public class Teste {
            public static void main(String[] args){
                Operacoes op = new Operacoes();
                System.out.println("Somando dois numeros "+ op.soma(5,7));
                System.out.println("Somando tres numeros "+ op.soma(7,7,2));
                System.out.println("Somando dois numeros "+ op.soma("palavra ", "teste "));

            }
}
