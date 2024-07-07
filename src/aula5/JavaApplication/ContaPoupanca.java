
package aula5.JavaApplication;


public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, String senha, float deposito) {
        super(titular, senha);
        saldo = deposito;
    }
    
    
     public boolean sacar(float valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    
    
     public String verificar(){
        return String.format("Saldo: R$%.2f", saldo);
    }
    
}
