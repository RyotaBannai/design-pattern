package design_pattern.observer.test;

import design_pattern.observer.observer.*;
import design_pattern.observer.subject.*;

public class WeatherStation {
  public static void main(String args[]) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(27f, 65f, 30.4f);

  }
}