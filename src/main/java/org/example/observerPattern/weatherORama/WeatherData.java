package org.example.observerPattern.weatherORama;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    List<Observer> observers;
    float temperature, pressure, humidity;

    public WeatherData() {
        observers = new ArrayList<>();

    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
       observers.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(temperature, pressure, humidity);
        }

    }
    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
