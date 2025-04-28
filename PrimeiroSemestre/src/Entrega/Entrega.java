package Entrega;

public class Entrega {
    private String destino;
    private double distancia;

    public Entrega(String destino, double distancia) {
        this.destino = destino;
        this.distancia = distancia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double calcularTempoEntrega(){
        return distancia / 100;
    }

    @Override
    public String toString() {
        return "Entrega{" +
                "destino='" + destino + '\'' +
                ", distancia=" + distancia +
                '}';
    }
}