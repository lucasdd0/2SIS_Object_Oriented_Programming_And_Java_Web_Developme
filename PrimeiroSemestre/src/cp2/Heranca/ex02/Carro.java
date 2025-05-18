package cp2.Heranca.ex02;

public class Carro extends Veiculo{

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    public String tipo(){
        return "Carro";
    }
}
