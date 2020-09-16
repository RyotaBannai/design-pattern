package design_patterns.adaptor.bird;

public class WildTurkey implements Turkey {
  public void gobble() {
    System.out.println("goro goro");
  }

  public void fly() {
    System.out.println("fly for the very short distance.");
  }
}