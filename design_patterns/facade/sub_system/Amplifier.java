package design_patterns.facade.sub_system;

public class Amplifier {
  Tuner tuner;
  DVDPlayer dvdPlayer;
  CDPlayer cdPlayer;
  Integer volume;

  public void on() {
    System.out.println("Amp on");
  }

  public void off() {
    System.out.println("Amp off");
  }

  public void setCD() {
    System.out.println("Amp: Set CD");
  }

  public void setDVD() {
    System.out.println("Amp: Set DVD");
  }

  public void setStereoSound() {
    System.out.println("Amp: Set Stereo Sound");
  }

  public void setSurroundSound() {
    System.out.println("Amp: Set Surround Sound");
  }

  public void setTuner() {
    System.out.println("Amp: Set Tuner");
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

}