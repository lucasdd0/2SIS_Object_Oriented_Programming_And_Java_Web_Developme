package cp.ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo r = new Retangulo();

        System.out.println("Digite a base do retangulo ");
        r.setBase(sc.nextDouble());

        System.out.println("Digite a altura do retangulo ");
        r.setAltura(sc.nextDouble());

        System.out.println(r.calculaPerimetro());
        System.out.println(r.caculaArea());


    }
}
