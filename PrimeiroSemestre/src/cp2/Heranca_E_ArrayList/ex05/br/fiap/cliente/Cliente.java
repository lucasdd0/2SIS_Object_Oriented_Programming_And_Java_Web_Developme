package cp2.Heranca_E_ArrayList.ex05.br.fiap.cliente;

public class Cliente {
    private long cpf;
    private String nome;

    public Cliente(long cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cpf: " + cpf + "\nNome: " + nome;
    }
}
