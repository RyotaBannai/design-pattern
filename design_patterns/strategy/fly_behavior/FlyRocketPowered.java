package design_patterns.strategy.fly_behavior;

public class FlyRocketPowered implements FlyBehavior {
  public void fly() {
    System.out.println("ロケットで飛んでいます");
  }
}