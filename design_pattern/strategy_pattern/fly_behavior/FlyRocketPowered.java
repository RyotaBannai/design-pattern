package design_pattern.strategy_pattern.fly_behavior;

public class FlyRocketPowered implements FlyBehavior {
  public void fly() {
    System.out.println("ロケットで飛んでいます");
  }
}