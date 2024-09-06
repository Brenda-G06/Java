package aula8.exemplooAbstract;

public class Retangulo extends Figura {
    private double base;
    private double altura;

    public Retangulo(double base, double altura, String nomeFigura) {
        this.base = base;
        this.altura = altura;
        setNomeFigura("Retangulo");
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaPerimetro(){
        return 2 * (base + altura);
    }

    @Override
    public double calculaArea(){
        return base * altura;
    }
}
