package aula5.JavaApplication;

public class ContaCorrente extends Conta {
  
    private float limite;
    
    public ContaCorrente(String titular, String senha, float limite) {
        super(titular, senha);
        this.limite = limite;    
    }
    

    public boolean sacar(float valor) {
        if (valor <= saldo + limite) {
            saldo = saldo - valor;
            return true;
        }
        return false;
    }
    
    public String verifica() {
        if (saldo >= 0) {
            return String.format("Saldo disponível: R$%.2f", saldo);
        } else {
            return String.format("Limite de R$%.2f usado: Saldo disponível: R$%.2f", limite + saldo, saldo);
        }
    }
    
    public float getLimite() {
        return limite;
    }
    
    public void setLimite(float limite) {
        this.limite = limite;
    }
}
