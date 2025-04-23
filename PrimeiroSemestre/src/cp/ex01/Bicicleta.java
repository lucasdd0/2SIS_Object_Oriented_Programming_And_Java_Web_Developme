package cp.ex01;

public class Bicicleta{
    private String cor;
    private int numeroMarchas;
    private double valor;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void mostraDados(){
        System.out.println("Cor: " + cor);
        System.out.println("Marchas: " + numeroMarchas);
        System.out.println("Valor: " + valor);
    }
}
