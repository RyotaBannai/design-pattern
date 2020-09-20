package design_patterns.compound.observer.observer;

import design_patterns.compound.observer.observable.QuackObservable;

public interface Observer {
  public void update(QuackObservable duck);
}