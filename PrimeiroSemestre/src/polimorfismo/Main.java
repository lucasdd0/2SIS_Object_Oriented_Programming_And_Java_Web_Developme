package polimorfismo;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;

public class Main {
    public static void main(String[] args) {

        try {
            double valor1 = parseDouble(showInputDialog("Valor 1"));
            double valor2 = parseDouble(showInputDialog("Valor 2"));
            double resultado = calcular(valor1, valor2);
            showMessageDialog(null, resultado);
        }catch(NumberFormatException e){
            showMessageDialog(null, "Erro! Insira um número válido.");
    }

    public static double calcular(double valor1, double valor2){
        return valor1 / valor2;
    }
}
