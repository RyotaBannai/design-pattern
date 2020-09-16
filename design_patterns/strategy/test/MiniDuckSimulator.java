package design_patterns.strategy.test;

import design_patterns.strategy.duck.*;
import design_patterns.strategy.fly_behavior.FlyRocketPowered;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();

    mallard.setFlyBehavior(new FlyRocketPowered()); // change the behavior dynamically
    mallard.performFly();
  }
}