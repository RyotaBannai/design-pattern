package design_pattern.decorator_pattern.condiment;

import design_pattern.decorator_pattern.beverage.*;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}