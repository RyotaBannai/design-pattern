package design_pattern.strategy.duck;

import design_pattern.strategy.quack_behavior.Quack;
import design_pattern.strategy.fly_behavior.FlyWithWings;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("本物のマガモです");
  }

}