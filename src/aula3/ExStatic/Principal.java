package aula3.ExStatic;

public class Principal {
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria("Ana", "123", 10);
        System.out.println("Conta cadastrada com ID: "+c1.identificador);
        ContaBancaria c2 = new ContaBancaria("Zé", "321", 100);
        System.out.println("Conta cadastrada com ID: "+c2.identificador);

        ContaBancaria.nomeBanco="Banco Cimol";
        System.out.println("Nome do banco c1 "+ContaBancaria.nomeBanco);
        System.out.println("Nome do banco c2 "+ContaBancaria.nomeBanco);

        ContaBancaria.nomeBanco = "Teste";
        System.out.println("Nome do banco c1 "+ContaBancaria.nomeBanco);
        System.out.println("Nome do banco c2 "+ContaBancaria.nomeBanco);
    }
}