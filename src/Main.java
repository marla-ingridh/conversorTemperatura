public class Main {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao temperatura1 = new ConversorTemperaturaPadrao();
        double temperaturaF1 = temperatura1.celsiusParaFahrenheit(55);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaF1);
        double temperaturaC1 = temperatura1.fahrenheitParaCelsius(80);
        System.out.println("Temperatura em Celsius: " + String.format("%.2f",temperaturaC1));


    }
}