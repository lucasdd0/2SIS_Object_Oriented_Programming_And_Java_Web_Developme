package cp2.Heranca.ex02;

public class Moto extends Veiculo{

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    public String tipo(){
        return "Moto";
    }

}
