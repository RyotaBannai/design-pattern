package design_pattern.command.vender;

public class Garage {
  /** actions */
  public void up() {
    System.out.println("up");
  }

  public void down() {
    System.out.println("down");
  }

  public void stop() {
    System.out.println("stop");
  }

  public void lightOn() {
    System.out.println("lightOn");
  }

  public void lightOff() {
    System.out.println("lightOff");
  }
}