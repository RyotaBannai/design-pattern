package design_pattern.decorator_pattern.beverage;

public class Espresso extends Beverage {
  public Espresso() {
    description = "エスプレッソ";
  }

  public double cost() {
    return 1.99;
  }
}