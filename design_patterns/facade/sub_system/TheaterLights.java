package design_patterns.facade.sub_system;

public class TheaterLights {
  public void on() {
    System.out.println("Theater Lights is on");
  }

  public void off() {
    System.out.println("Theater Lights is off");
  }

  public void dim() {
    System.out.println("Theater Lights dims");
  }
}