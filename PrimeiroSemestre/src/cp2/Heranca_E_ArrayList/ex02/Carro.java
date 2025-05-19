package cp2.Heranca_E_ArrayList.ex02;

public class Carro extends Veiculo{

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    public String tipo(){
        return "Carro";
    }
}
