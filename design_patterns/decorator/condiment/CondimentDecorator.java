package design_patterns.decorator.condiment;

import design_patterns.decorator.beverage.*;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}