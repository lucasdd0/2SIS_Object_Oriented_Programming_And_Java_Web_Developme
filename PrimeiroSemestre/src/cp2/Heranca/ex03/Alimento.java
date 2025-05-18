package cp2.Heranca.ex03;

public class Alimento extends Produto{

    private int garantiaMeses;

    public Alimento(String nome, double preco, int garantiaMeses) {
        super(nome, preco);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public String toString(){
        return super.toString() + "\nGarantia Mêses:" + garantiaMeses;
    }

}
