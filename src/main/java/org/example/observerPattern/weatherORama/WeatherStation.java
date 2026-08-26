package org.example.observerPattern.weatherORama;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        MobileDisplay md = new MobileDisplay(weatherData);
        weatherData.setMeasurements(89, 65, 30.4f);

    }
}
