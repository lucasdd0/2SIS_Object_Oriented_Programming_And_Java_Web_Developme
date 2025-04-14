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
        return altura * base;
    }

    public double getPerimetro(){
        return 2 * (base + altura);
    }

    public void imprimindoRomeo(){
        System.out.println("Altura: " + altura);
        System.out.println("Base: " + base);
        System.out.println("Area: " + getArea());
        System.out.println("Perimetro: " + getPerimetro());
    }
}
