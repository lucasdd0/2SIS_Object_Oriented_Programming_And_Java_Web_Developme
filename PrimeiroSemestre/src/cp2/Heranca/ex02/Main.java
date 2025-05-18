package cp2.Heranca.ex02;

import cp2.Heranca.ex01.Empregado;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculo = new ArrayList<>();

        veiculo.add(new Carro("Civic", 2020));
        veiculo.add(new Moto("Harley", 2019));

        for(Veiculo v : veiculo){
            System.out.println(v);
            System.out.println("------------");
        }

    }
}
