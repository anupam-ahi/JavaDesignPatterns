package org.example.observerPattern.weatherORama;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
