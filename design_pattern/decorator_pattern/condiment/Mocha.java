package design_pattern.decorator_pattern.condiment;

import design_pattern.decorator_pattern.beverage.Beverage;

public class Mocha extends CondimentDecorator {
  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", モカ";
  }

  public double cost() {
    return .20 + beverage.cost();
  }
}