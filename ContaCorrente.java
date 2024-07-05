
package aula5.javaapplication;

public class ContaCorrente extends Conta {
  
    private float limite;
    
    ContaCorrente(String titular, String senha, float limite){
        super(titular,senha);
        this.limite = limite;    
    }
    
     public boolean sacar(float valor) {
        if (valor+limite <= saldo) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    
     
     public String verifica(float saldo){
         if(saldo>=0){
          String retorno = String.format("slimite de "+ saldo);
         }
         else{
             System.out.printf("limite de R$ ", saldo, saldo+limite);
         }
        return null;
     }
    
    
    
}
