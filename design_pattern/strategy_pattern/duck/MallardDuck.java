package design_pattern.strategy_pattern.duck;

import design_pattern.strategy_pattern.quack_behavior.Quack;
import design_pattern.strategy_pattern.fly_behavior.FlyWithWings;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("本物のマガモです");
  }

}