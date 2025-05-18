package cp2.Heranca.ex04;

public class Forma {
    private double cordenadaX;
    private double cordenadaY;
    private double raio;

    public Forma(double cordenadaX, double cordenadaY, double raio) {
        this.cordenadaX = cordenadaX;
        this.cordenadaY = cordenadaY;
        this.raio = raio;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(getRaio(), 2);
    }

    public double getCordenadaX() {
        return cordenadaX;
    }

    public void setCordenadaX(double cordenadaX) {
        this.cordenadaX = cordenadaX;
    }

    public double getCordenadaY() {
        return cordenadaY;
    }

    public void setCordenadaY(double cordenadaY) {
        this.cordenadaY = cordenadaY;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString(){
        return "Cordenada X: " + cordenadaX + "\nCordenada Y: " + cordenadaY + "\nRaio: " + String.format("%.2f", raio) + "\nArea: " + String.format("%.2f", calcularArea());
    }
}
