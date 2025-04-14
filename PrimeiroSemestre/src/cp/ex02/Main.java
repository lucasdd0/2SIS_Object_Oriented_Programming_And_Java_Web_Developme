package cp.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.println("Digite a base: ");
        double base = sc.nextDouble();
        r.setBase(base);

        System.out.println("Digite a altura: ");
        double altura = sc.nextDouble();
        r.setAltura(altura);

        r.imprimindoRomeo();

    }
}
