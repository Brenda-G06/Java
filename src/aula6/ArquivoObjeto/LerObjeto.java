package aula6.ArquivoObjeto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LerObjeto {
    public static void main(String[] args)  {
            File caminho = new File("C:\\Users\\Cimol\\Documents\\aula");
            File arquivo = new File(caminho, "pessoas.db");
            try {
                ObjectInputStream arquivoObjs = new ObjectInputStream(new FileInputStream(arquivo.getAbsolutePath()));
              Pessoa[] lista = (Pessoa[]) arquivoObjs.readObject();
              int cont = 0;
              Pessoa p;
              do{
                p = lista[cont];
                if(p!=null){
                    cont++;
                }
                
            
              }
              while(p!=null);
              for(int i=0; i<cont; i++){
                System.out.println(lista[i]);
                
              }
                // Pessoa p1 = (Pessoa) arquivoObjs.readObject();
                // System.out.println(p1);
                arquivoObjs.close();

           
            } 
            
            catch (IOException e) {
                System.out.println("ERRO!!!!");
            }
            catch(ClassNotFoundException e){
                System.out.println("Classe não encontrada");
            }
    }
}
