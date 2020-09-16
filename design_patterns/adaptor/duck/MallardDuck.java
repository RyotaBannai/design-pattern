package design_patterns.adaptor.duck;

public class MallardDuck implements Duck {
  public void quack() {
    System.out.println("ga-ga-");
  }

  public void fly() {
    System.out.println("Mallard Duck is flying");
  }
}