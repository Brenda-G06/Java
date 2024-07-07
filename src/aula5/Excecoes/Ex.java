package aula5.Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex {

    public static int leNumero(String mensagem) {
        try (Scanner ler = new Scanner(System.in)) {
            int numero = 0;
            boolean correto = false;
            
            while (!correto) {
                try {
                    System.out.println(mensagem);
                    numero = ler.nextInt();
                    correto = true; 
                } catch (InputMismatchException erro) {
                    System.out.println("Por favor, digite um número válido.");
                    ler.next(); 
                }
            }
            return numero;
        }
    }

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            boolean correto = false;

            while (!correto) {
                try {
                    int n1 = leNumero("Digite um número: ");
                    int n2 = leNumero("Digite outro número: ");
                    int resultado = n1 / n2;
                    System.out.println("O resultado foi de: " + resultado);
                    correto = true; 
                } catch (InputMismatchException erro) {
                    System.out.println("n1 e n2 precisam ser números.");
                } catch (ArithmeticException erro) {
                    System.out.println("Não é possível dividir por zero.");
                }
            }
        }
    }
}
