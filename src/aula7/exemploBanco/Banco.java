
package aula7.exemploBanco;

import java.io.*;
import java.util.Scanner;

public class Banco {

    public static void gravarCorrente(ContaCorrente[] contas, String nomeArquivo) {
        try (ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            for (ContaCorrente conta : contas) {
                if (conta != null) {
                    objEscrita.writeObject(conta);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao gravar contas corrente: " + e.getMessage());
        }
    }

    public static void gravarPoupanca(ContaPoupanca[] contas, String nomeArquivo) {
        try (ObjectOutputStream objEscrita = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            for (ContaPoupanca conta : contas) {
                if (conta != null) {
                    objEscrita.writeObject(conta);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao gravar contas poupança: " + e.getMessage());
        }
    }

    public static ContaCorrente[] lerCorrente(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            System.out.println("Arquivo de contas correntes não encontrado.");
            return new ContaCorrente[0];
        }
        try (ObjectInputStream objLeitura = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            ContaCorrente[] contas = new ContaCorrente[20];
            int i = 0;
            while (true) {
                try {
                    contas[i++] = (ContaCorrente) objLeitura.readObject();
                } catch (EOFException e) {
                    break; // Fim do arquivo
                }
            }
            return contas;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler contas correntes: " + e.getMessage());
            return new ContaCorrente[0];
        }
    }

    public static ContaPoupanca[] lerPoupanca(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        if (!arquivo.exists()) {
            System.out.println("Arquivo de contas poupança não encontrado.");
            return new ContaPoupanca[0];
        }
        try (ObjectInputStream objLeitura = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            ContaPoupanca[] contas = new ContaPoupanca[20];
            int i = 0;
            while (true) {
                try {
                    contas[i++] = (ContaPoupanca) objLeitura.readObject();
                } catch (EOFException e) {
                    break; // Fim do arquivo
                }
            }
            return contas;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler contas poupança: " + e.getMessage());
            return new ContaPoupanca[0];
        }
    }

    public static String leString(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem + ": ");
        return ler.nextLine();
    }

    public static float leFloat(String mensagem){
        Scanner ler = new Scanner(System.in);
        System.out.print(mensagem + ": ");
        return ler.nextFloat();
    }

    public static ContaCorrente acessaCC(ContaCorrente c1){
        String opc;
        System.out.println("Acessando a conta " + c1.getIdentificador());
        System.out.println("Bem-vindo, " + c1.getTitular());
        do {
            System.out.println("Selecione uma opção");
            System.out.println("d - realizar um depósito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar o saldo");
            System.out.println("a - alterar a senha");
            System.out.println("e - sair");
            opc = leString("").toLowerCase();
            switch (opc){
                case "d" -> {
                    float valor = leFloat("Qual valor deseja depositar");
                    c1.depositar(valor);
                    System.out.println("Depósito realizado!");
                }
                case "s" -> {
                    float valor = leFloat("Qual o valor do saque");
                    if (c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo mais limite insuficientes");
                }
                case "v" -> System.out.println(c1.verificaSaldo());
                case "a" -> {
                    String senha = leString("Qual a nova senha");
                    c1.setSenha(senha);
                }
            }
        } while (!opc.equals("e"));
        return c1;
    }

    public static ContaPoupanca acessaCP(ContaPoupanca c1){
        String opc;
        System.out.println("Acessando a conta " + c1.getIdentificador());
        System.out.println("Bem-vindo, " + c1.getTitular());
        do {
            System.out.println("Selecione uma opção");
            System.out.println("d - realizar um depósito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar o saldo");
            System.out.println("a - alterar a senha");
            System.out.println("e - sair");
            opc = leString("").toLowerCase();
            switch (opc){
                case "d" -> {
                    float valor = leFloat("Qual valor deseja depositar");
                    c1.depositar(valor);
                    System.out.println("Depósito realizado!");
                }
                case "s" -> {
                    float valor = leFloat("Qual o valor do saque");
                    if (c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo insuficiente");
                }
                case "v" -> System.out.println(c1.verificaSaldo());
                case "a" -> {
                    String senha = leString("Qual a nova senha");
                    c1.setSenha(senha);
                }
            }
        } while (!opc.equals("e"));
        return c1;
    }

    public static ContaCorrente cadastraCC(){
        String titular = leString("Qual o titular da conta");
        String senha = leString("Qual a senha");
        float limite = leFloat("Qual o limite inicial");
        ContaCorrente c1 = new ContaCorrente(titular, senha, limite);
        System.out.println("Conta cadastrada com o identificador " + c1.getIdentificador());
        return c1;
    }

    public static ContaPoupanca cadastraCP(){
        String titular = leString("Qual o titular da conta");
        String senha = leString("Qual a senha");
        float deposito = leFloat("Qual valor depositar");
        ContaPoupanca c1 = new ContaPoupanca(titular, senha, deposito);
        System.out.println("Conta cadastrada com o identificador " + c1.getIdentificador());
        return c1;
    }

    public static void main(String[] args) {
        File caminho = new File("C:\\Users\\Cimol");
        ContaCorrente[] listaCC = lerCorrente(caminho + "contas_corrente.dat");
        ContaPoupanca[] listaCP = lerPoupanca(caminho + "contas_poupanca.dat");
        int contCC = listaCC.length;
        int contCP = listaCP.length;
        String opc;
        do {
            System.out.println("Selecione uma opção");
            System.out.println("cc - cadastrar conta corrente");
            System.out.println("cp - cadastrar conta poupança");
            System.out.println("ac - acessar conta corrente");
            System.out.println("ap - acessar conta poupança");
            System.out.println("e - sair");
            opc = leString("");
            switch (opc){
                case "cc" -> {
                    listaCC[contCC] = cadastraCC();
                    contCC++;
                    gravarCorrente(listaCC, caminho + "contas_corrente.dat");
                }
                case "cp" -> {
                    listaCP[contCP] = cadastraCP();
                    contCP++;
                    gravarPoupanca(listaCP, caminho + "contas_poupanca.dat");
                }
                case "ac" -> {
                    String identificador = leString("Qual o identificador");
                    String senha = leString("Qual a senha");
                    int posicao = -1;
                    for (int i = 0; i < contCC; i++) {
                        if (listaCC[i].validaAcesso(identificador, senha))
                            posicao = i;
                    }
                    if (posicao >= 0) {
                        listaCC[posicao] = acessaCC(listaCC[posicao]);
                        gravarCorrente(listaCC, caminho + "contas_corrente.dat");
                    } else {
                        System.out.println("Conta inexistente ou senha incorreta!");
                    }
                }
                case "ap" -> {
                    String identificador = leString("Qual o identificador");
                    String senha = leString("Qual a senha");
                    int posicao = -1;
                    for (int i = 0; i < contCP; i++) {
                        if (listaCP[i].validaAcesso(identificador, senha))
                            posicao = i;
                    }
                    if (posicao >= 0) {
                        listaCP[posicao] = acessaCP(listaCP[posicao]);
                        gravarPoupanca(listaCP, caminho + "contas_poupanca.dat");
                    } else {
                        System.out.println("Conta inexistente ou senha incorreta!");
                    }
                }
            }
        } while (!opc.equals("e"));
    }
}

