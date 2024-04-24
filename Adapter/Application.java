public class Application {
    public static void main(String[] args) {
        // Using the Adapter pattern
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        TemperatureProvider adapter = new CelsiusTemperatureAdapter(temperatureSensor);

        // The client code works with the TemperatureProvider interface
        double temperatureInFahrenheit = adapter.getTemperature();
        System.out.println("Temperature in Fahrenheit: " + temperatureInFahrenheit);
    }

    
}
