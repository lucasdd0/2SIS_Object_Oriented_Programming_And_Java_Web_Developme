package Entrega;

public class EntregaExpresso extends Entrega{

    public EntregaExpresso(String destino, double distancia) {
        super(destino, distancia);
    }

    @Override
    public double calcularTempoEntrega() {
        return super.calcularTempoEntrega() * 0.5;
        // 0,5 / 100km
    }
}