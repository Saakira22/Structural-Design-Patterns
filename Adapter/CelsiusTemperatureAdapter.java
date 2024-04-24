public class CelsiusTemperatureAdapter implements TemperatureProvider {
    private TemperatureSensor temperatureSensor;

    public CelsiusTemperatureAdapter(TemperatureSensor temperatureSensor) {
        this.temperatureSensor = temperatureSensor;
    }

    @Override
    public double getTemperature() {
        // Adapt the Celsius temperature to Fahrenheit
        double temperatureInCelsius = temperatureSensor.getTemperatureInCelsius();
        return celsiusToFahrenheit(temperatureInCelsius);
    }

    private double celsiusToFahrenheit(double celsius) {
        // Conversion logic: Celsius to Fahrenheit
        return (celsius * 9 / 5) + 32;
    }
}
