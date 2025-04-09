package cp.ex01;

import java.util.Scanner;

public class Bicicleta {
    String cor;
    int numeroDeMarchas;
    double valor;

    public void usuarioInstancia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a cor:");
        cor = sc.next();
        System.out.println("Digite o numero de marchas: ");
        numeroDeMarchas = sc.nextInt();
        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();
    }

    public void retornaDados(){
        System.out.println(cor + "\n" + numeroDeMarchas + "\n" + valor);
    }
}
