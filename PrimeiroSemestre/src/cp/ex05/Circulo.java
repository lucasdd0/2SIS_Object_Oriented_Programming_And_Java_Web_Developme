package cp.ex05;

public class Circulo {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculaPerimetro(){
        return Math.PI * raio * 2;
    }


}
