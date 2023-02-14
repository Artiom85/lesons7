

public class Main {
    public static void main(String[] args) {
        TemperatureConverter temperatura = new TemperatureConverter();
          temperatura.setToFahrenheit(32);
          temperatura.setToCelsius(10);

        System.out.println("Grade C: " + temperatura.getToCelsius());
        System.out.println("Grade F: " + temperatura.getToFahrenheit());
    }
}