package design_patterns.compound.adaptor;

import design_patterns.compound.Quackable;
import design_patterns.compound.bird.Goose;
import design_patterns.compound.observer.observable.Observable;
import design_patterns.compound.observer.observer.Observer;

public class GooseAdaptor implements Quackable {
  Goose goose;
  Observable observable;

  public GooseAdaptor(Goose goose) {
    this.goose = goose;
    this.observable = new Observable(this);
  }

  public void quack() {
    goose.honk();
  }

  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  public void notifyObservers() {
    observable.notifyObservers();
  }
}