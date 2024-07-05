/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5.javaapplication;

/**
 *
 * @author Cimol
 */
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
