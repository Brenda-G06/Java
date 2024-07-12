package aula6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerTexto {
        public static void main(String[]args){
            try{
                BufferedReader arquivoTexto = new BufferedReader(new FileReader("./texto.txt"));
                    String texto =" ";
                    String linha = " ";
                    while(linha!=null){
                        linha = arquivoTexto.readLine();
                        if(linha!=null)
                        texto+=linha;
                    }
                        System.out.println(texto);
                        arquivoTexto.close();

            }
            catch(IOException e){
                System.out.println("Erro ao ler");
            }
        }
}
