package design_patterns.compound.factory;

import design_patterns.compound.decorator.QuackCounter;
import design_patterns.compound.duck.*;
import design_patterns.compound.Quackable;
import design_patterns.compound.bird.Goose;
import design_patterns.compound.adaptor.GooseAdaptor;

public class CountingDuckFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new QuackCounter(new MallardDuck());
  }

  @Override
  public Quackable createRedheadDuck() {
    return new QuackCounter(new DuckCall());
  }

  @Override
  public Quackable createDuckCall() {
    return new QuackCounter(new DuckCall());
  }

  @Override
  public Quackable createRubberDuck() {
    return new QuackCounter(new RubberDuck());
  }

  @Override
  public Quackable createGoose() {
    return new QuackCounter(new GooseAdaptor(new Goose()));
  }
}