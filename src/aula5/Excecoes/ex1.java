package aula5.Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
        public static void main(String[] args){
            try (Scanner ler = new Scanner(System.in)) {
                try{
                System.out.println("digite um numero ");
                int n1 =  ler.nextInt();
                System.out.println("digite outro numero ");
                int n2 = ler.nextInt();
                int resultado = n1/n2;
                System.out.println("o resultado foi de: " + resultado );
                }
                catch(InputMismatchException erro){
                    System.out.println("n1 e n2 precisam ser números ");
                    // erro.printStackTrace();
                }
                catch(ArithmeticException erro){
                    System.out.println("Nao é possivel dividir por zero");
                }
            }

        }
}
