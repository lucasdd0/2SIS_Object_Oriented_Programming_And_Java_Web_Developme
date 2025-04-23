package cp.ex04;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = validaHoras(horas);
        this.minutos = validaMinutosOuSegundos(minutos);
        this.segundos = validaMinutosOuSegundos(segundos);
    }

    public int validaHoras(int horas){
        if (horas >= 0 && horas <= 24){
            return horas;
        }
        return 0;
    }

    public int validaMinutosOuSegundos(int valor){
        if (valor >= 0 && valor <= 60){
            return valor;
        }
        return 0;
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

}
