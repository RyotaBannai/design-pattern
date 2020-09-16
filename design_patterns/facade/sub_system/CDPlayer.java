package design_patterns.facade.sub_system;

public class CDPlayer {
  public void on() {
    System.out.println("CD is on");
  }

  public void off() {
    System.out.println("CD is off");
  }

  public void eject() {
    System.out.println("CD is ejected");
  }

  public void pause() {
    System.out.println("CD is paused");
  }

  public void play() {
    System.out.println("Play CD");
  }

  public void stop() {
    System.out.println("Stop CD");
  }
}