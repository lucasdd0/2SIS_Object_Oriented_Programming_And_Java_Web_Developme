package cp2.Heranca.ex01;

public class EmpregadoHorista extends Empregado{
    int totalHorasTrabalhadas;
    double valorDeHoraTrabalhada;


    public EmpregadoHorista(long matricula, String nome, int totalHorasTrabalhadas, double valorDeHoraTrabalhada){
        super(matricula, nome);
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
        this.valorDeHoraTrabalhada = valorDeHoraTrabalhada;
    }

    public double calcularSalario(){
        return totalHorasTrabalhadas * valorDeHoraTrabalhada;
    }

    @Override
    public String toString(){
        return super.toString() + "\nTotal de horas trabalhadas: " + totalHorasTrabalhadas + "\nValor da hora trabalhada: " + valorDeHoraTrabalhada + "\nSalario: " + calcularSalario();
    }

}
