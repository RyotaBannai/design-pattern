package design_pattern.strategy_pattern.test;

import design_pattern.strategy_pattern.duck.*;
import design_pattern.strategy_pattern.fly_behavior.FlyRocketPowered;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    mallard.setFlyBehavior(new FlyRocketPowered()); // change the behavior dynamically
    mallard.performFly();
  }
}