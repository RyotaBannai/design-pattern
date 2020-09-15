package design_pattern.strategy_pattern.quack_behavior;

public class Quack implements QuackBehavior {
  public void quack() {
    System.out.println("ガーガー");
  }
}