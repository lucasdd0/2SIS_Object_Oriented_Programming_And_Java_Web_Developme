package cp2.Heranca.ex03;

public class Eletronico extends Produto{

    private String dataValidade;

    public Eletronico(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString(){
        return super.toString() + "\nData Validade:" + dataValidade;
    }

}
