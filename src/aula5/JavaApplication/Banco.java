package aula5.JavaApplication;

import java.util.Scanner;

public class Banco {

    public static String leString(String mensagem) {
        try (Scanner ler = new Scanner(System.in)) {
			System.out.print(mensagem + ": ");
			return ler.nextLine();
		}
    }

    public static float leFloat(String mensagem) {
        try (Scanner ler = new Scanner(System.in)) {
			System.out.print(mensagem + ": ");
			return ler.nextFloat();
		}
    }

    public static ContaCorrente acessaCC(ContaCorrente c1) {
        System.out.print(" ");
        leString("Qual o nome do titular: ");
        leString("Qual a senha do titular");
        return c1;
    }

    public static ContaPoupanca acessaCP(ContaPoupanca c1) {
        System.out.print(" ");
        leString("Qual o nome do titular: ");
        leString("Qual a senha do titular");
        return c1;
    }

    public static void main(String[] args) {
        ContaCorrente[] listaCC = new ContaCorrente[20];
        ContaPoupanca[] listaCP = new ContaPoupanca[20];
        int contCC = 0;
        int contCP = 0;
        String opc;

        do {
            System.out.println("Selecione uma opção");
            System.out.println("cc - cadastrar conta corrente");
            System.out.println("cp - cadastrar conta poupança");
            System.out.println("ac - acessar conta corrente");
            System.out.println("ap - acessar conta poupança");
            System.out.println("e - sair");
            opc = leString("");

            switch (opc) {
                case "cc" -> {
                    listaCC[contCC] = cadastraCC();
                    contCC++;
                }
                case "cp" -> {
                    listaCP[contCP] = cadastraCP();
                    contCP++;
                }
                case "ac" -> {
                    String identificador = leString("Qual o identificador");
                    String senha = leString("Qual a senha");
                    int posicao = -1;
                    for (int i = 0; i < contCC; i++) {
                        if (listaCC[i].validar(identificador, senha)) {
                            posicao = i;
                            break;
                        }
                    }
                    if (posicao >= 0) {
                        listaCC[posicao] = acessaCC(listaCC[posicao]);
                    } else {
                        System.out.println("Informação de acesso inválida");
                    }
                }
                case "ap" -> {
                    String identificador = leString("Qual o identificador");
                    String senha = leString("Qual a senha");
                    int posicao = -1;
                    for (int i = 0; i < contCP; i++) {
                        if (listaCP[i].validar(identificador, senha)) {
                            posicao = i;
                            break;
                        }
                    }
                    if (posicao >= 0) {
                        listaCP[posicao] = acessaCP(listaCP[posicao]);
                    } else {
                        System.out.println("Informação de acesso inválida");
                    }
                }
            }
        } while (!opc.equals("e"));
    }

    public static ContaCorrente cadastraCC() {
        String titular = leString("Qual o nome do titular");
        String senha = leString("Qual a senha");
        float limite = leFloat("Qual o limite inicial");
        ContaCorrente c1 = new ContaCorrente(titular, senha, limite);
        System.out.println("Conta cadastrada com id " + c1.getIdentificador());
        return c1;
    }

    public static ContaPoupanca cadastraCP() {
        String titular = leString("Qual o nome do titular");
        String senha = leString("Qual a senha");
        float deposito = leFloat("Qual o depósito inicial");
        ContaPoupanca c1 = new ContaPoupanca(titular, senha, deposito);
        System.out.println("Conta cadastrada com id " + c1.getIdentificador());
        return c1;
    }
}
