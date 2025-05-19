package cp2.Heranca_E_ArrayList.ex03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Alimento("Banana", 20.20,20));
        produtos.add(new Eletronico("Banana", 20.20,"20/20/2060"));

        for(Produto p : produtos){
            System.out.println(p);
            System.out.println("------------------");
        }

    }
}
