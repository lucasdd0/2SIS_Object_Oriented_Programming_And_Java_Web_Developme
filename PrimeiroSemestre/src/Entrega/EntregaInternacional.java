package Entrega;

public class EntregaInternacional extends Entrega {

    public EntregaInternacional(String destino, double distancia) {
        super(destino, distancia);
    }

    @Override
    public double calcularTempoEntrega() {
        return super.calcularTempoEntrega() + 5;
        // +5 dias ao calc normal (1 / 100km + 5 dias)
    }
}
