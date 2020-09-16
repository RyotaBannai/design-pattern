package design_patterns.decorator.condiment;

import design_patterns.decorator.beverage.Beverage;

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