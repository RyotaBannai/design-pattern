package design_patterns.compound.observer.observable;

import design_patterns.compound.observer.observer.Observer;

public interface QuackObservable {
  public void registerObserver(Observer observer);

  public void notifyObservers();
}