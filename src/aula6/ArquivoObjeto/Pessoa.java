package aula6.ArquivoObjeto;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    private String sobrenome;

    @Override //metodo foi herdado e ta subsitituindo ele 
    public String toString(){
        return "Nome "+nome+" Sobrenome "+ sobrenome;
    }
}
