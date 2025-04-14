package cp.ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conversao conversao = new Conversao();

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        conversao.setCelsius(celsius);

        conversao.impressaoTemp();
    }
}
