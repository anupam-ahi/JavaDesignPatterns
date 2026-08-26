package org.example.observerPattern.weatherORama;

public class MobileDisplay implements Observer, DisplayElement {
    WeatherData weatherData;
    private float pressure;
    private float humidity;
    private float temperature;
    public MobileDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }


    @Override
    public void display() {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions" + temperature + "F degree and " + humidity);
    }
}
