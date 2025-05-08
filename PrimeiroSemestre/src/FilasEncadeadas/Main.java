package FilasEncadeadas;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new LinkedList<>();

        lista.add(new Produto( 1, "arroz", 50));
        lista.add(new Produto( 1, "arroz", 50));
        lista.add(new Produto( 1, "arroz", 50));
        lista.add(new Produto( 3, "batata", 50));

        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equals("arroz")){
                lista.remove(i);
            }

        }



        for(Produto p : lista){
            System.out.println(p.getNome());
        }

    }
}
