package design_patterns.facade.test;

import design_patterns.facade.facade.HomeTheaterFacade;
import design_patterns.facade.sub_system.*;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner();
    DVDPlayer dvd = new DVDPlayer();
    CDPlayer cd = new CDPlayer();
    Projector projector = new Projector();
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    PopcornPotter popper = new PopcornPotter();

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
    homeTheater.watchMovie("Avengers");
    homeTheater.endMovie();
  }
}