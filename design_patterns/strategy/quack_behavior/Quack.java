package design_patterns.strategy.quack_behavior;

public class Quack implements QuackBehavior {
  public void quack() {
    System.out.println("ガーガー");
  }
}