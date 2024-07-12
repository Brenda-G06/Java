package aula6;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class AquirvoDeTexto {
        public static void main(String[]args){
            try{
                BufferedWriter arquivoTexto = new BufferedWriter(new FileWriter("./texto.txt"));
                for(int i =0; i<10; i++){
                    arquivoTexto.append("linha "+i+ " do arquivo \n");
                }
                arquivoTexto.close();
            }
            catch(FileNotFoundException e){
                System.out.println("Erro ao escrever arquivo");
            }
            catch(IOException e){
                System.out.println("erro ao criar arquivo");
            }
        }
}
