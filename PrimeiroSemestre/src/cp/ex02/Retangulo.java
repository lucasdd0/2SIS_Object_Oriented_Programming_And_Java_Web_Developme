package cp.ex02;

public class Retangulo {
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
        return base * altura;
    }

    public double getPerimetro(){
        return 2 * (base + altura);
    }

    public void mostrarDados(){
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
    }
}
