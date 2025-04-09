package cp.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.println("Informe a base: ");
        double base = sc.nextDouble();
        r.setBase(base);

        System.out.println("Informe a altura: ");
        double altura = sc.nextDouble();
        r.setAltura(altura);

        System.out.println("Perimetro: " + r.getPerimetro());
        System.out.println("Area: " + r.getArea());

    }
}
