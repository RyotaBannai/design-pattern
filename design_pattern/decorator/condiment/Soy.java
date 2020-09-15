package design_pattern.decorator.condiment;

import design_pattern.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator {
  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return beverage.getDescription() + ", 豆乳";
  }

  public double cost() {
    return .15 + beverage.cost();
  }
}