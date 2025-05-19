package cp2.Heranca_E_ArrayList.ex01;

public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Matrícula: " + matricula + "\nNome: " + nome;
    }

}
