package cp2.Heranca_E_ArrayList.ex02;

public abstract class Veiculo {
    String modelo;
    int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract String tipo();

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\nAno: " + ano + "\nTipo: " + tipo();
    }
}
