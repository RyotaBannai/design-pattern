package design_patterns.facade.facade;

import design_patterns.facade.sub_system.*;

public class HomeTheaterFacade {
  Amplifier amp;
  Tuner tuner;
  DVDPlayer dvdPlayer;
  CDPlayer cdPlayer;
  Projector projector;
  TheaterLights theaterLights;
  Screen screen;
  PopcornPotter popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvdPlayer, CDPlayer cdPlayer, Projector projector,
      TheaterLights theaterLights, Screen screen, PopcornPotter popper) {
    this.amp = amp;
    this.tuner = tuner;
    this.dvdPlayer = dvdPlayer;
    this.cdPlayer = cdPlayer;
    this.projector = projector;
    this.theaterLights = theaterLights;
    this.screen = screen;
    this.popper = popper;
  }

  public void watchMovie() {
  }

  public void endMovie() {
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