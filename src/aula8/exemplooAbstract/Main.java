package aula8.exemplooAbstract;

public class Main {
    public static void main(String[] args) {

        Circulo c1 = new Circulo(5);
        System.out.println("A área da figura " + c1.getNomeFigura() + " vale " + c1.calculaArea());
        System.out.println("O perímetro da figura " + c1.getNomeFigura() + " vale " + c1.calculaPerimetro());

     
        Retangulo r1 = new Retangulo(8, 4, "Retângulo");
        System.out.println("A área da figura " + r1.getNomeFigura() + " vale " + r1.calculaArea());
        System.out.println("O perímetro da figura " + r1.getNomeFigura() + " vale " + r1.calculaPerimetro());
    }
}
