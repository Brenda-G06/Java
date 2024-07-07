package aula5.Polimorfismo;

public class Pessoa {
    String nome; 
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
    String sobrenome;


    String obterDados(){
        return"Nome"+ nome+"sobrenome: "+ sobrenome;
    }
}
