package aula6.ArquivoObjeto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Escrever {
    public static void main(String[] args) {
    File caminho = new File("C:\\Users\\Cimol\\Documents\\aula");

        if(caminho.exists()){
            System.out.println("a pasta existe ");
        }
        else{
            caminho.mkdirs();
            System.out.println("Caminho criado");
        } //declarando o arquivo para salvar a pessoa 

        File arquivo = new File(caminho, "pessoas.db");
        System.out.println(arquivo.getAbsolutePath());
            try{
                ObjectOutputStream arquivoObjs = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));
               Pessoa [] lista = new Pessoa[10];
               try (Scanner ler = new Scanner(System.in)) {
                String opc;
                int cont = 0;
                do{
                    System.out.println("Lendo informação da pessoa "+ (cont+1));

                    System.out.println("Qual o nome: ");
                    String nome = ler.next();
                    System.out.println("Qual o sobrenome: ");
                    String sobrenome = ler.next();
                    lista[cont] = new Pessoa();
                    lista[cont].setNome(nome);
                    lista[cont].setSobrenome(sobrenome);
                    System.out.println("Tem mais pessoas?  s - sim  n - nao");
                    opc = ler.next().toLowerCase();
                    cont++;
                }
                while(opc.equals("s"));
            }
                arquivoObjs.writeObject(lista);
                
                arquivoObjs.close();
            }//criar instancia de pessoa
            


            catch(IOException e){
                System.out.println("ERRO!!!!!!");
            }
        }
}
