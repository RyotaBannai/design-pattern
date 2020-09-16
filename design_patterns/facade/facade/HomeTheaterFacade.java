package design_patterns.facade.facade;

import design_patterns.facade.sub_system.*;

public class HomeTheaterFacade {
  Amplifier amp;
  Tuner tuner;
  DVDPlayer dvd;
  CDPlayer cd;
  Projector projector;
  TheaterLights lights;
  Screen screen;
  PopcornPotter popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvd, CDPlayer cd, Projector projector,
      TheaterLights lights, Screen screen, PopcornPotter popper) {
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.cd = cd;
    this.projector = projector;
    this.lights = lights;
    this.screen = screen;
    this.popper = popper;
  }

  public void watchMovie(String movie) {
    System.out.println("<<Preparing for watching the movie...>>");
    popper.on();
    popper.pop();
    lights.dim();
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDVD();
    amp.setCD();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }

  public void endMovie() {
    System.out.println("<<Stopping the movie...>>");
    popper.off();
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    projector.off();
    amp.off();
    dvd.eject();
    dvd.off();
  }

  public void listenToCD() {
  }

  public void endCD() {
  }

  public void listenRadio() {
  }

  public void endRadio() {
  }
}