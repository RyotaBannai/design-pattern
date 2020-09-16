package design_patterns.strategy.duck;

import design_patterns.strategy.quack_behavior.QuackBehavior;
import design_patterns.strategy.fly_behavior.FlyBehavior;

public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior fb) {
    flyBehavior = fb;
  }

  public void setQuackBehavior(QuackBehavior qb) {
    quackBehavior = qb;
  }

  public void swim() {
    System.out.println("全ての鴨は浮かびます");
  }
}