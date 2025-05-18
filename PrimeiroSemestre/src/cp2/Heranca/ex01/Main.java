package cp2.Heranca.ex01;

public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[3];

        empregado[0] = new EmpregadoComissionado(1, "Joao", 100, 10);
        empregado[1] = new EmpregadoHorista(2, "Fernando", 200, 50);
        empregado[2] = new EmpregadoHorista(3, "Luis", 300, 30);

        for(Empregado e : empregado){
            System.out.println(e);
            System.out.println();
        }

    }
}
