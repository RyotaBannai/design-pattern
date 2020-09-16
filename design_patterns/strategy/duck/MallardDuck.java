package design_patterns.strategy.duck;

import design_patterns.strategy.quack_behavior.Quack;
import design_patterns.strategy.fly_behavior.FlyWithWings;

public class MallardDuck extends Duck {
  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("本物のマガモです");
  }

}