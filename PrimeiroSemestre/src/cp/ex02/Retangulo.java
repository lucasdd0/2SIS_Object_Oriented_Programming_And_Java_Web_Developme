package cp.ex02;

public class Retangulo {
    private double altura;
    private double base;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculaPerimetro(){
        return 2 * (altura + base);
    }

    public double caculaArea(){
        return altura * base;
    }
}
