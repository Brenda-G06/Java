package aula5.Polimorfismo;

public class Principal {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.setNome("Brenda");
        p1.setSobrenome("Gomes");
        

        Aluno a1 = new Aluno();
        a1.setNome(null);
        a1.setMatricula(null);
        a1.setSobrenome(null);

        System.out.println(p1.obterDados());
        System.out.println(a1.obterDados());
    }
}
