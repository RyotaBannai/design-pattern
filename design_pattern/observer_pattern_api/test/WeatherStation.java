package design_pattern.observer_pattern_api.test;

import design_pattern.observer_pattern_api.observer.*;
import design_pattern.observer_pattern_api.observable.*;

public class WeatherStation {
  public static void main(String args[]) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeasurements(27f, 65f, 30.4f);

  }
}