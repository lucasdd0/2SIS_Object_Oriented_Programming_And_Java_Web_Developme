package cp.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bicicleta bicicleta = new Bicicleta();

        System.out.println("Digite a cor da bicicleta: ");
        bicicleta.setCor(sc.next());
        System.out.println("Digite o numero de marchas: ");
        bicicleta.setNumeroMarchas(sc.nextInt());
        System.out.println("Digite o valor da bicicleta: ");
        bicicleta.setValor(sc.nextDouble());

        bicicleta.mostraDados();

    }
}
