package design_patterns.compound.factory;

import design_patterns.compound.Quackable;
import design_patterns.compound.adaptor.GooseAdaptor;
import design_patterns.compound.bird.Goose;
import design_patterns.compound.duck.*;

public class DuckFactory extends AbstractDuckFactory {
  @Override
  public Quackable createMallardDuck() {
    return new MallardDuck();
  }

  @Override
  public Quackable createRedheadDuck() {
    return new RedheadDuck();
  }

  @Override
  public Quackable createDuckCall() {
    return new DuckCall();
  }

  @Override
  public Quackable createRubberDuck() {
    return new RubberDuck();
  }

  @Override
  public Quackable createGoose() {
    return new GooseAdaptor(new Goose());
  }
}