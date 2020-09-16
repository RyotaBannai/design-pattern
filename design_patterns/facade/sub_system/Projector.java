package design_patterns.facade.sub_system;

public class Projector {
  public void on() {
    System.out.println("Projector is on");
  }

  public void off() {
    System.out.println("Projector is off");
  }

  public void tvMode() {
    System.out.println("Projector: TV mode");
  }

  public void wideScreenMode() {
    System.out.println("Projector: Wide Screen mode");
  }
}