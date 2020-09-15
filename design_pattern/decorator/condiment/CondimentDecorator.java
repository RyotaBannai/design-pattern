package design_pattern.decorator.condiment;

import design_pattern.decorator.beverage.*;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}