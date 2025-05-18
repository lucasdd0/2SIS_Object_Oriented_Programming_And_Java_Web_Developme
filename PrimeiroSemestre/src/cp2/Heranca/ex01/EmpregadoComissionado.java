package cp2.Heranca.ex01;

public class EmpregadoComissionado extends Empregado{
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao){
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){
        return totalDeVendas * comissao / 100;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTotal de vendas: " + totalDeVendas + "\nComissao: " + comissao + "\nSalario: " + calcularSalario();
    }

}
