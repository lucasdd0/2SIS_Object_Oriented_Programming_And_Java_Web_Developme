package cp2.Heranca_E_ArrayList.ex04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Cilindro(10, 20, 4, 10));
        formas.add(new Cilindro(20, 7, 8, 20));
        formas.add(new Circulo(40, 6, 9));
        formas.add(new Circulo(10, 20, 4));

        StringBuilder lista = new StringBuilder("\nFORMAS:\n-------------\n");
        for(Forma f : formas){
            lista.append(f).append("\n------------\n");
        }

        System.out.println(lista);

    }
}
