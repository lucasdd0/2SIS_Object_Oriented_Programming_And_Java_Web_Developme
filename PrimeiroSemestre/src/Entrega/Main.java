package Entrega;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Entrega> lista = new ArrayList<>();
        lista.add(new EntregaExpresso("BR", 200));
        lista.add(new EntregaInternacional("RJ", 600));
        lista.add(new EntregaInternacional("NYC", 100000));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getDestino());
        }

        for (Entrega e : lista) {
            System.out.println(e.getDestino());
        }

        System.out.println(lista);

    }
}
