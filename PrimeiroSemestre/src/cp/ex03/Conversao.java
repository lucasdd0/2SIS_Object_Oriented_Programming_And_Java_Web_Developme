package cp.ex03;

public class Conversao {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double fahrenheit(){
        return (9/5 * celsius) + 32;
    }

    public double kelvin(){
        return celsius + 273;
    }

    public void impressaoTemp(){
        System.out.println("Temperatura em fahrenheit: " + fahrenheit());
        System.out.println("Temperatura em kelvin: " + kelvin());
    }
}
