package CalculaCilindro;

public class Cilindro extends Forma implements Volume{

    private Double altura;

    public Cilindro(int cordenadaX, int cordenadaY, Double raio, Double altura) {
        super(cordenadaX, cordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public double calcularVolume(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                '}';
    }
}
