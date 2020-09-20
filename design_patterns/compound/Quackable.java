package design_patterns.compound;

import design_patterns.compound.observer.observable.QuackObservable;

public interface Quackable extends QuackObservable {
  public void quack();
}