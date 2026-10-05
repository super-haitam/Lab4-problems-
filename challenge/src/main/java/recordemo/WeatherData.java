package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return temperatureCelsius * 9 / 5 + 32;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return String.format("Current weather: %f°C (%f°F) and %s", temperatureCelsius, temperatureFahrenheit(), conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        return new WeatherData((tempFahrenheit - 32) * 5 / 9, conditions);
    }

    public static void main(String[] args) {
        System.out.println("Today's weather: " + fromFahrenheit(77, "Sunny").getSummary());
        System.out.println("Yesterday's weather: " + fromFahrenheit(50, "Cloudy").getSummary());
    }
}
