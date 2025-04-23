package cp.ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circulo circulo = new Circulo();

        System.out.println("Digite o raio: ");
        circulo.setRaio(sc.nextDouble());

        System.out.println("Valor raio: " + circulo.getRaio());

        System.out.println("Area: " + String.format("%.2f", circulo.calculaArea()));

        System.out.println("Perimetro: " + String.format("%.2f", circulo.calculaPerimetro()));

    }
}
