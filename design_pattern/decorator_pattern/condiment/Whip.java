package design_pattern.decorator_pattern.condiment;

import design_pattern.decorator_pattern.beverage.Beverage;

public class Whip extends CondimentDecorator {
  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", ホイップ";
  }

  public double cost() {
    return .10 + beverage.cost();
  }
}