package design_patterns.compound.factory;

import design_patterns.compound.Quackable;

public abstract class AbstractDuckFactory {
  public abstract Quackable createMallardDuck();

  public abstract Quackable createRedheadDuck();

  public abstract Quackable createDuckCall();

  public abstract Quackable createRubberDuck();

  public abstract Quackable createGoose();
}