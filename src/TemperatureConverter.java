public class TemperatureConverter {


    public int toCelsius;
    public int toFahrenheit;
    public int getToFahrenheit() {
        return calculateFahrenheit();
    }

    public void setToFahrenheit(int toFahrenheit) {
        this.toFahrenheit = toFahrenheit;
    }
    public int getToCelsius() {
        return calculateCelsius();
    }
    public void setToCelsius(int toCelsius) {
        this.toCelsius = toCelsius;
    }


    private int calculateCelsius(){
        return (5 * (toFahrenheit - 32)) / 9;
    }
    private int calculateFahrenheit() {
        return (9 * toCelsius + (32 * 5)) / 5;
    }


}


