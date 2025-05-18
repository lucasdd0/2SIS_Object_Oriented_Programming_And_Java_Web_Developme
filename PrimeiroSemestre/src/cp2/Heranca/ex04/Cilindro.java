package cp2.Heranca.ex04;

public class Cilindro extends Forma{
    private double altura;

    public Cilindro(double cordenadaX, double cordenadaY, double raio, double altura) {
        super(cordenadaX, cordenadaY, raio);
        this.altura = altura;
    }

    public double calcularVolume(){
        return calcularArea() * altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString(){
        return super.toString() + "\nVolume: " + String.format("%.2f", calcularVolume());
    }
}
