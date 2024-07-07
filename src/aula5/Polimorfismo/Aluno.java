package aula5.Polimorfismo;

public class Aluno extends Pessoa{
    private String matricula; 

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula(){
        return matricula;
    }
    


    Public String; java.lang.String obterDados(){
        return "nome"+getNome()+" Sobrenome: "+getSobrenome()+ " Matricula "+ matricula;
    }

@Override //para mostrar objetos na tela 
    public String toString(){
        return "nome"+getNome()+" Sobrenome: "+getSobrenome()+ " Matricula "+ matricula;
    }
}



