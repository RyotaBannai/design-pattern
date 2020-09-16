package design_patterns.command.vender;

public class Stereo {
  public void on() {
    System.out.println("Stereo on");
  }

  public void off() {
    System.out.println("Stereo off");
  }

  public void setCD() {
    System.out.println("Set CD");
  }

  public void setDVD() {
    System.out.println("Set DVD");
  }

  public void setRadio() {
    System.out.println("Set Radio");
  }

  public void setVolume() {
    System.out.println("Set Volume");
  }
}