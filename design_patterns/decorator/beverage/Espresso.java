package design_patterns.decorator.beverage;

public class Espresso extends Beverage {
  public Espresso() {
    description = "エスプレッソ";
  }

  public double cost() {
    return 1.99;
  }
}